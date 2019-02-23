package com.hc360.controller;

import com.hc360.model.*;
import com.hc360.service.BusinSupportTradeService;
import com.hc360.service.TemppicsService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 临时图片服务类
 * @author hk
 * @date 2019-02-23
 */
@RestController
@RequestMapping("/v1/temppics")
public class TempicsController {
	
	protected static final Logger logger = LoggerFactory.getLogger("TempicsController");

    @Autowired
    TemppicsService temppicsService;

    /**
     * 通过sessionid获取临时图片
     * @author hk
     * @date 2019-02-23
     * @return
     * @throws Exception
     */
    @RequestMapping("/geTmppics/{sessionid}")
    public List<Tmppic> getTmpRecord(@PathVariable("sessionid")long sessionid) throws Exception {
    	return  temppicsService.getTmpRecord(sessionid);
    }



}
