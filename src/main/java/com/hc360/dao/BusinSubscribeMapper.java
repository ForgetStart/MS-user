

package com.hc360.dao;

import com.hc360.b2b.exception.MmtException;
import com.hc360.dao.base.BusinSubscribeMapperProvider;
import com.hc360.model.CorSubscribeConf;
import com.hc360.model.FirstoperateLog;
import com.hc360.model.SubscribTable;
import org.apache.ibatis.annotations.*;

import java.util.List;


/**
 * 
 * @author HK
 * 商机邮件订阅相关mapper
 * @date 2019-02-27
 */
@Mapper
public interface BusinSubscribeMapper {

	/**
	 * 保存商机订阅
	 * @param ubscribTable
	 * @return
	 * @throws Exception
	 */
	@Insert("INSERT INTO SUBSCRIB_TABLE(SUBS_ID, SUPCATID, KEYWORD, CLSID, INFOTYPE,ZONE, PUBDATE, CHECKED, CHECKEDATE, TRADE, PROVINCEID, CITYID, PROVIDERID, SUBTYPE, ISSEND, ISREPEAT, UPDATETIME, STATES, DELDATE, VALIDATE_TIME) " +
			"VALUES(SUBSCRIB_TABLE_SEQ.NEXTVAL,#{supcatid,jdbcType=VARCHAR},#{keyword,jdbcType=VARCHAR}, #{clsid,jdbcType=VARCHAR},#{infotype,jdbcType=VARCHAR},#{zone,jdbcType=VARCHAR},#{pubdate,jdbcType=DATE},#{checked,jdbcType=VARCHAR}, #{checkedate,jdbcType=DATE},#{trade,jdbcType=VARCHAR},#{provinceid,jdbcType=NUMERIC},#{cityid,jdbcType=NUMERIC},#{providerid,jdbcType=NUMERIC}, #{subtype,jdbcType=NUMERIC},#{issend,jdbcType=NUMERIC},#{isrepeat,jdbcType=NUMERIC}, #{updatetime,jdbcType=DATE}, #{states,jdbcType=NUMERIC},  #{deldate,jdbcType=DATE}, #{validatetime,jdbcType=NUMERIC} )")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "SUBS_ID")
	public int saveSubscribTable(SubscribTable ubscribTable)throws Exception;

	/**
	 * 保存第一发布商机订阅
	 * @param firstoperateLog
	 * @return
	 * @throws Exception
	 */
	@Insert("INSERT INTO FIRSTOPERATE_LOG(ID,OPERATE, PUBDATE, PROVIDERID) " +
			"VALUES(FIRSTOPERATE_LOG_SEQ.NEXTVAL, #{operate,jdbcType=NUMERIC}, #{pubdate,jdbcType=DATE}, #{providerid,jdbcType=NUMERIC})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	public int saveOperateLog(FirstoperateLog firstoperateLog)throws Exception;


	/**
	 * 保存会员订阅配置表
	 * @param corSubscribeConf
	 * @return
	 * @throws Exception
	 */
	@Insert("INSERT INTO COR_SUBSCRIBE_CONF(PROVIDERID,ISSEND, ISMAIL,FREQUENCY,SENDDATE,REMAILDATE,PUBDATE,MODIFYDATE,ENDDATE,CANCELDATE) " +
			"VALUES(#{id,jdbcType=NUMERIC},#{issend,jdbcType=NUMERIC},#{ismail,jdbcType=NUMERIC},#{frequency,jdbcType=NUMERIC}, #{senddate,jdbcType=DATE},#{remaildate,jdbcType=DATE},#{pubdate,jdbcType=DATE},#{modifydate,jdbcType=DATE},#{enddate,jdbcType=DATE}, #{canceldate,jdbcType=DATE})")
	public void saveCorSubscribeConf(CorSubscribeConf corSubscribeConf)throws Exception;

	/**
	 * 查询企业已经订阅的关键词个数
	 * @param providerid
	 * @return
	 * @throws Exception
	 */
	@Select("select count(1) from SUBSCRIB_TABLE a where a.subtype='1' and a.providerid=#{providerid} and a.states='0'")
	public  int getSubKewordCount(@Param("providerid") long providerid)throws Exception;


	/**
	 * 判断关键词、分类是否已经被订阅，用于简单订阅
	 * @param providerid
	 * @param keyword
	 * @param supcatid
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@SelectProvider(type = BusinSubscribeMapperProvider.class, method="isRepeatKeyWord")
	public List<SubscribTable> isRepeatKeyWord(@Param("providerid") long providerid,@Param("keyword")String keyword,@Param("supcatid") String supcatid, @Param("id")long id, @Param("infotype")String infotype) throws Exception;

	/**
	 * 察看是否是首次订阅
	 * @param providerid 用户
	 * @param operate 订阅类型
	 * 1:订阅关键字
	 * @return
	 * @throws Exception
	 */
	@Select("select count(*) from FIRSTOPERATE_LOG a where a.providerid=#{providerid} and a.operate=#{operate}")
	public int isFirstOperate(@Param("providerid")long providerid,@Param("operate")int operate)throws Exception;


	/**
	 * 查询用户订阅配置信息
	 * @param providerid 用户
	 * @return
	 * @throws Exception
	 */
	@Results({@Result(property = "id", column = "PROVIDERID")})
	@Select("select * from COR_SUBSCRIBE_CONF a where a.PROVIDERID=#{providerid}")
	public CorSubscribeConf findCorSubscribeConf(@Param("providerid")long providerid)throws Exception;

	/**
	 * 更新用户订阅配置信息
	 * @param corSubscribeConf
	 * @return
	 * @throws Exception
	 */
	@Update("<script>update COR_SUBSCRIBE_CONF set " +
			"<if test='!isSetDate'>ISMAIL=#{corSubscribeConf.ISMAIL,jdbcType=NUMERIC},REMAILDATE=#{corSubscribeConf.remaildate,jdbcType=DATE}, </if>" +
			"MODIFYDATE=#{corSubscribeConf.modifydate,jdbcType=DATE},ISSEND=#{corSubscribeConf.issend,jdbcType=NUMERIC}," +
			"ENDDATE=#{corSubscribeConf.enddate,jdbcType=DATE} where id=#{corSubscribeConf.id,jdbcType=NUMERIC}</script>")
	public int updateCorSubscribeConf(@Param("corSubscribeConf")CorSubscribeConf corSubscribeConf)throws Exception;
}
