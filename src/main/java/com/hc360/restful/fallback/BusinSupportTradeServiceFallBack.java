package com.hc360.restful.fallback;

import com.hc360.restful.BusinSupportTradeRestfulService;
import com.hc360.vo.BusinSupporttradeInfo;
import com.hc360.vo.SupportTradeParam;
import com.hc360.vo.result.BaseResult;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2019/3/8 15:29
 * @Description:
 */
@Component
public class BusinSupportTradeServiceFallBack implements BusinSupportTradeRestfulService {

    Logger log = Logger.getLogger("BusinSupportTradeServiceFallBack");

    @Override
    public BaseResult<BusinSupporttradeInfo> getBusinSupportTradeInfo(SupportTradeParam supporttradeparam) throws Exception {

        log.error("ERROR：getBusinSupportTradeInfo(用户分类是否支持在线交易)出现熔断，执行Fallback处理，请尽快联系管理员查看！！！");
        BaseResult<BusinSupporttradeInfo> result = new BaseResult<>();
        result.setErrcode(600l);
        result.setErrmsg("未发现服务，系统异常！");
        return result;
    }
}
