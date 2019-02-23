

package com.hc360.dao;

import com.hc360.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * 
 * @author HK
 * 在线交易相关mapper
 *
 */
@Mapper
public interface BusinSupportTradeMapper {

	@Select("select a.* from LICENSE_CATEGORY a where a.status='0' and a.cattype='0'")
	List<LicenseCategory> getLicenseCategoryAll()throws Exception;

	@Select("select a.id,a.LICAT_ID as licatid,a.supcatid,a.pubdate,a.operator,a.status  from LICENSE_CATEGORY_ITEMS a where a.LICAT_ID =#{licatid} and a.status='0'")
	List<LicenseCategoryItems> getLicenseCategoryItems(@Param("licatid") String licatid)throws Exception;


	@Select("select a.id,a.LICAT_ID as licatid,a.supcatid,a.pubdate,a.operator,a.status  from LICENSE_CATEGORY_ITEMS a where a.supcatid =#{supcatid} and a.status='0'")
	List<LicenseCategoryItems> getLicenseCategoryItemsBySupcatid(@Param("supcatid") String supcatid)throws Exception;

	@Select("select a.id,a.LICAT_ID as licatid,a.providerid,a.checked,a.refreason,a.pubdate,a.modifydate,a.checkdate,a.refcheckdate,a.operator,a.status" +
			" from USER_LICENSE a where a.status='0' and a.checked='1'")
	List<UserLicense> getUserLicenseAll()throws Exception;


	@Select("select a.id,a.LICAT_ID as licatid,a.providerid,a.checked,a.refreason,a.pubdate,a.modifydate,a.checkdate,a.refcheckdate,a.operator,a.status" +
			" from USER_LICENSE a where a.providerid=#{providerid} and a.status='0' and a.checked='1'")
	List<UserLicense> getUserLicenseAllByProviderid(@Param("providerid") long providerid)throws Exception;


	@Select("select a.id,a.USERLI_ID as userliid,a.licensename,a.picpath,a.pubdate,a.enddate,a.status from USER_LICENSE_ITEMS a where a.USERLI_ID =#{userliid} and a.status='0'")
	List<UserLicenseItems> getUserLicenseItems(@Param("userliid") String userliid);

	@Select("select a.id,a.USER_ID as userid,a.providerid,a.USER_NAME as username,a.PERSONAL_ID as personalid,a.COMPANY_ID as companyid,a.CHECK_ID as checkid,a.BANK_ID as bankid" +
			",a.type,a.AUTHEN_STATE as authenstate,a.HFB_STATE as hfbstate,a.CHECKED_STATE as checkedstate,a.name,a.SOURCE_TYPE as sourcetype,a.money,a.VERIFY_COUNT as verifycount" +
			",a.APPLY_COUNT as applycount,a.HFB_FAIL_CODE as hfbfailcode,a.HFB_FAIL_CAUSE as hfbfailcause,a.SERIAL_NUMBER as serialnumber,a.APPLY_UNIQUE_ID as applyuniqueid,a.END_TIME as endtime" +
			",a.CREATE_TIME as createtime,a.UPDATE_TIME as updatetime,a.HFB_TIME as hfbtime,a.IS_SEND as issend" +
			" from COR_AUTHEN_STATE a where a.providerid=#{providerid}")
	List<CorAuthenState> findCorAuthenStateList(@Param("providerid") long providerid);

}
