

package com.hc360.dao;

import com.hc360.model.*;
import org.apache.ibatis.annotations.*;

import java.util.List;


/**
 * 
 * @author HK
 * 临时图片服务mapper
 *
 */
@Mapper
public interface TemppicsMapper {

	/**
	 * 通过sessionid查询临时图片列表
	 * @param sessionid
	 * @return
	 * @throws Exception
	 */
	@Results({@Result(property = "id", column = "TPIC_ID")})
	@Select("select a.* from Tmppic a where a.sessionid = #{sessionid} order by a.picindex")
	public List<Tmppic> getTmpRecord(@Param("sessionid") long sessionid) throws Exception;


}
