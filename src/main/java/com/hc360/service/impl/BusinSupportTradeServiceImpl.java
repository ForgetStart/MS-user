package com.hc360.service.impl;

import com.hc360.dao.BusinSupportTradeMapper;
import com.hc360.model.*;
import com.hc360.service.BusinSupportTradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 是否支持在线交易
 * @author hk
 *
 */
@Service
public class BusinSupportTradeServiceImpl implements BusinSupportTradeService {

	@Resource
	BusinSupportTradeMapper businSupportTradeMapper;


	@Override
	public List<LicenseCategory> getLicenseCategoryAll()throws Exception {
		return businSupportTradeMapper.getLicenseCategoryAll();
	}

	@Override
	public List<LicenseCategoryItems> getLicenseCategoryItems(long licatid)throws Exception {
		return businSupportTradeMapper.getLicenseCategoryItems(String.valueOf(licatid));
	}

	@Override
	public List<LicenseCategoryItems> getLicenseCategoryItemsBySupcatid(String supcatid)throws Exception {
		return businSupportTradeMapper.getLicenseCategoryItemsBySupcatid(supcatid);
	}

	@Override
	public List<UserLicense> getUserLicenseAll() throws Exception{
		return businSupportTradeMapper.getUserLicenseAll();
	}

	@Override
	public List<UserLicense> getUserLicenseAllByProviderid(long providerid) throws Exception{
		return businSupportTradeMapper.getUserLicenseAllByProviderid(providerid);
	}

	@Override
	public List<UserLicenseItems> getUserLicenseItems(long userliid) throws Exception{
		return businSupportTradeMapper.getUserLicenseItems(userliid+"");
	}

	@Override
	public List<CorAuthenState> findCorAuthenStateList(long providerid) throws Exception{
		return businSupportTradeMapper.findCorAuthenStateList(providerid);
	}
	
	
	
	
}
