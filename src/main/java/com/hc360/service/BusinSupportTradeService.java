package com.hc360.service;


import com.hc360.model.*;

import java.util.List;


/**
 * �Ƿ�֧�����߽���
 * @author hc360
 *
 */
public interface BusinSupportTradeService {

	/**
	 * ��ȡ������Ҫ֤�����
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<LicenseCategory> getLicenseCategoryAll()throws Exception;

	/**
	 * ͨ��֤������ȡ�̻��ķ���
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<LicenseCategoryItems> getLicenseCategoryItems(long licatid)throws Exception;


	/**
	 * ͨ�������ȡ֤����Ϣ
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	public List<LicenseCategoryItems> getLicenseCategoryItemsBySupcatid(String supcatid)throws Exception;
	/**
	 * ��ȡ�����û�����Ȩ����
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<UserLicense> getUserLicenseAll()throws Exception;

	/**
	 * ��ȡָ���û�����Ȩ����
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<UserLicense> getUserLicenseAllByProviderid(long providerid)throws Exception;

	/**
	 * ��ȡ�û���Ȩ��ϸ
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<UserLicenseItems> getUserLicenseItems(long userliid)throws Exception;
	/**
	 * ��ȡָ���û���Ȩ����״̬
	 * @author hk
	 * @date 2019-02-22
	 * @return
	 * @throws Exception
	 */
	List<CorAuthenState> findCorAuthenStateList(long providerid)throws Exception;

}
