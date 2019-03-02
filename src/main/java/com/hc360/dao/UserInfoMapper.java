package com.hc360.dao;

import com.hc360.dao.base.UserBaseMessageProvider;
import com.hc360.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/2/20 18:00
 * @Description: corp库信息查询
 */
@Mapper
public interface UserInfoMapper {

    @Select("select oct.*,oct.providerid as id from on_cor_table oct where oct.providerid = #{providerId} and oct.states = '0'")
    OnCorTable findOnCorTableByProviderId(@Param("providerId") Long providerId) throws Exception;

    @SelectProvider(type = UserBaseMessageProvider.class, method = "SelectUserWithParam")
    OnCorTable findUserBaseByOnCorTable(OnCorTable onCorTable) throws Exception;

    @Select("select co.*,co.providerid as id from on_cor_table_other co where co.providerid = #{providerId}")
    OnCorTableOther findOnCorTableOther(@Param("providerId") Long providerId) throws Exception;

    @Select("select oct.*,oct.providerid as id from cor_table oct where oct.providerid = #{providerId} and oct.CHECKED = 1")
    CorTable findCorTableByProviderIdAndChecked(@Param("providerId") Long providerId) throws Exception;

    @Select("select * from cor_backlist cb where cb.providerid = #{providerId} and cb.states = #{states}")
    List<CorBackListVo> findCorBack(@Param("providerId") Long providerId, @Param("states") String states) throws Exception;

    @Select("select count(1) from Cor_District cd where cd.providerid = #{providerId}")
    int isDistrictByProviderid(@Param("providerId") Long providerId) throws Exception;

    @Select("select count(1) from cor_simple_reg csr where csr.userid = #{userId} and csr.states = '0'")
    int isSimpleUserByProviderId(@Param("userId") Long userId) throws Exception;

    @Select("select operate_type from operate_whilte_list a where a.providerid= #{providerId} and  a.states=0")
    List<Long> findOperateWhiteListByProviderId(@Param("providerId") Long providerId) throws Exception;

    @Select("select * from main_area ma order by ma.pinyinhead,ma.sortvalue")
    List<MainArea> findMainArea() throws Exception;

    @Select("select sa.areaname from sys_area sa where sa.areacode = #{areaCode}")
    String findAreaNameByAreaCode(@Param("areaCode") String areaCode) throws Exception;

    @Select("select count(1) from mobile_bind mb where mb.providerid = #{providerId} and mb.isbind = #{isBind}")
    int isBindMobile(@Param("providerId") Long providerId, @Param("isBind") Long isBind) throws Exception;

    @SelectProvider(type = UserBaseMessageProvider.class, method = "findLeaveWordCount")
    int findLeaveWordCount(RecvnotesParam recvparam) throws Exception;

    @SelectProvider(type = UserBaseMessageProvider.class, method = "findCity")
    CityVo findCity(CityVo cityVo) throws Exception;

    @SelectProvider(type = UserBaseMessageProvider.class, method = "findProvince")
    ProvinceVo findProvince(ProvinceVo provinceVo) throws Exception;

    @Select("select count(1) from cor_certificate_state cs where cs.providerid = #{providerId} and cs.certificate_state = '2' and cs.state = '0'")
    int isRealAuth(@Param("providerId") Long providerId) throws Exception;

    @Select("select count(1) from corp_busin_sumlimit cb where cb.providerid = #{providerId}")
    int isExistProviderLimit(@Param("providerId") Long providerId);

    @Select("select count(c.providerid) from On_Cor_Table c inner join On_Cor_Table_Other t on t.providerid=c.providerid where t.sourcetypeid=#{sourcetypeid} and (c.name is null or c.CONTACTER is null or c.name=' ' or c.CONTACTER='' or c.CONTACTER=' ') and c.providerid=#{providerId}")
    int checkIsMakeupInfoUserToOnCorTable(@Param("providerId") Long providerId, @Param("sourcetypeid") String sourcetypeid) throws Exception;

    @Select("select count(c.providerid) from Cor_Table c inner join Cor_Table_Other t on t.providerid=c.providerid where t.sourcetypeid=#{sourcetypeid} and (c.name is null or c.CONTACTER is null or c.name=' ' or c.CONTACTER='' or c.CONTACTER=' ') and c.providerid=#{providerId}")
    int checkIsMakeupInfoUserToCorTable(@Param("providerId") Long providerId, @Param("sourcetypeid") String sourcetypeid) throws Exception;
}
