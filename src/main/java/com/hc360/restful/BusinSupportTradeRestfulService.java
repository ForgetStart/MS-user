package com.hc360.restful;

import com.hc360.restful.fallback.BusinSupportTradeServiceFallBack;
import com.hc360.vo.BusinSupporttradeInfo;
import com.hc360.vo.SupportTradeParam;
import com.hc360.vo.result.BaseResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: Administrator
 * @Date: 2019/3/8 15:28
 * @Description:
 */
@FeignClient(value="mscommon", fallback = BusinSupportTradeServiceFallBack.class)
public interface BusinSupportTradeRestfulService {

    /**
     * 用户分类是否支持在线交易(行业不支持则认为不支持，行业支持判断分类是否支持，分类支持再区分免费付费会员，分类不支持判断是否允许特许经营)
     * @param supporttradeparam
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/v1/common/getissupporttradeinfo",method = RequestMethod.POST)
    BaseResult<BusinSupporttradeInfo> getBusinSupportTradeInfo(@RequestBody SupportTradeParam supporttradeparam) throws Exception;
}
