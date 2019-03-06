package com.hc360.service;

import java.util.List;

import com.hc360.bo.SendAddressParams;
import com.hc360.model.SendAddress;

public interface BusinLogisticsService {
	
	/**
	 * 获取用户当前有效的发货列表
	 * @param providerid
	 * @return
	 */
	List<SendAddress> getUserSendAddress(long providerid);
	
	void addSendAddress(SendAddressParams params);

}
