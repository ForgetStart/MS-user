package com.hc360.restful.fallback;
import com.hc360.restful.ProductService;
import com.hc360.vo.BusinLimitParam;
import com.hc360.vo.result.BaseResult;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @Auther: Administrator
 * @Date: 2019/3/4 11:24
 * @Description:
 */
@Component
public class ProductServiceFallBack implements ProductService {

    Logger log = Logger.getLogger("ProductServiceFallBack");

    @Override
    public BaseResult<Integer> findBusinLimit(BusinLimitParam businLimitParam) {
        log.error("ERROR：findBusinLimit(获取用户可发送的商机上限)出现熔断，执行Fallback处理，请尽快联系管理员查看！！！");
        BaseResult<Integer> result = new BaseResult<Integer>();
        result.setErrcode(600l);
        result.setErrmsg("未发现服务，系统异常！");
        return result;
    }

    @Override
    public BaseResult<Integer> isExistAreaLimit(String areaId) {
        log.error("ERROR：isExistAreaLimit(判断该账号是否存在发布商机的数目限制 返回true存在账号限制)出现熔断，执行Fallback处理，请尽快联系管理员查看！！！");
        BaseResult<Integer> result = new BaseResult<Integer>();
        result.setErrcode(600l);
        result.setErrmsg("未发现服务，系统异常！");
        return result;
    }
}
