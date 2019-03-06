package com.hc360.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hc360.bo.SendAddressParams;
import com.hc360.model.SendAddress;

@Mapper
public interface BusinLogisticsMapper {

	@Results({ @Result(property = "id", column = "SEND_ADDRESS_ID"),
			@Result(property = "streetAddress", column = "STREET_ADDRESS"),
			@Result(property = "isDefault", column = "IS_DEFAULT") })
	@Select("SELECT SA.SEND_ADDRESS_ID,SA.STREET_ADDRESS,SA.IS_DEFAULT FROM SEND_ADDRESS SA  WHERE SA.PROVIDERID = #{providerid} AND SA.STATES = '0'")
	List<SendAddress> getUserSendAddress(long providerid);
	
	
	@Insert("INSERT INTO SEND_ADDRESS (SEND_ADDRESS_ID,SSOID,PROVIDERID,PROVINCE,CITY,AREA,STREET_ADDRESS,IS_DEFAULT,STATES,PUBLISH_TIME,PUBLISH_MAN,COUNTRY) "
			+ " VALUES (SEND_ADDRESS_SEQ.NEXTVAL,#{ssoid},#{providerid},#{province},#{city},#{area},#{address},#{isdefault},'0',sysdate,'会员新增',#{country})")
	void insertAddress(SendAddressParams params);
	

	@Update("UPDATE SEND_ADDRESS SET IS_DEFAULT='1' WHERE PROVIDERID=#{providerid}")
	int updateAddress(long providerid);

}
