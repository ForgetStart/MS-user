package com.hc360.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hc360.bo.SendAddressParams;
import com.hc360.common.ReturnCode;
import com.hc360.model.SendAddress;
import com.hc360.service.BusinLogisticsService;
import com.hc360.vo.result.BaseResult;


@Controller
public class BusinLogisticsController {
	
	
    @Autowired
    BusinLogisticsService businLogisticsService;


    @RequestMapping("/logistics/add_address")
    @ResponseBody
	public BaseResult addLogistics(@RequestBody SendAddressParams params) throws Exception {
		BaseResult result = new BaseResult<>();
		List<SendAddress> lst = businLogisticsService.getUserSendAddress(params.getProviderid());
		if (lst != null && lst.size() > 4) {
			// 最多5条发货地址
			result.setErrcode(10001);
			result.setErrmsg("物流发货地址最多不能超过5条");
			return result;
		}
		businLogisticsService.addSendAddress(params);
		result.setErrcode(ReturnCode.OK.getErrcode());
		result.setErrmsg(ReturnCode.OK.getErrmsg());
		return result;

	}
}
