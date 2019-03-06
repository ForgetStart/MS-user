package com.hc360.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hc360.bo.SendAddressParams;
import com.hc360.dao.BusinLogisticsMapper;
import com.hc360.model.SendAddress;
import com.hc360.service.BusinLogisticsService;

@Service
public class BusinLogisticsServiceImpl implements BusinLogisticsService{
	
	@Resource
	BusinLogisticsMapper businLogisticsMapper;

	@Override
	public List<SendAddress> getUserSendAddress(long providerid) {
		// TODO Auto-generated method stub
		return businLogisticsMapper.getUserSendAddress(providerid);
	}

	@Override
	public void addSendAddress(SendAddressParams params) {
		// TODO Auto-generated method stub
		if ("0".equals(params.getIsdefault())) {
			// 默认发货地址
			businLogisticsMapper.updateAddress(params.getProviderid());
		}
		businLogisticsMapper.insertAddress(params);
	}

}
