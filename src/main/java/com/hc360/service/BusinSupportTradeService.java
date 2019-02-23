package com.hc360.service;


import com.hc360.model.*;

import java.util.List;


/**
 * 是否支持在线交易
 * @author hc360
 *
 */
public interface BusinSupportTradeService {

	/**
	 * 获取所有需要证书分类
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<LicenseCategory> getLicenseCategoryAll()throws Exception;

	/**
	 * 通过证书分类获取商机的分类
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<LicenseCategoryItems> getLicenseCategoryItems(long licatid)throws Exception;


	/**
	 * 通过分类获取证书信息
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	public List<LicenseCategoryItems> getLicenseCategoryItemsBySupcatid(String supcatid)throws Exception;
	/**
	 * 获取所有用户已授权分类
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<UserLicense> getUserLicenseAll()throws Exception;

	/**
	 * 获取指定用户已授权分类
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<UserLicense> getUserLicenseAllByProviderid(long providerid)throws Exception;

	/**
	 * 获取用户授权明细
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<UserLicenseItems> getUserLicenseItems(long userliid)throws Exception;
	/**
	 * 获取指定用户授权分类状态
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<CorAuthenState> findCorAuthenStateList(long providerid)throws Exception;

}
