package com.hc360.restful;

import com.hc360.restful.fallback.ProductServiceFallBack;
import com.hc360.vo.BusinLimitParam;
import com.hc360.vo.result.BaseResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 调用 ms-productpub-service服务
 */
@FeignClient(value="productpubservice", fallback = ProductServiceFallBack.class)
public interface ProductService {

    /**
     * 获取用户可发送的商机上限
     * @param businLimitParam
     * @return
     */
    @RequestMapping(value = "/v1/product/findbusinlimit", method = RequestMethod.POST)
    BaseResult<Integer> findBusinLimit(@RequestBody BusinLimitParam businLimitParam);

    /**
     *判断当前用户是否所在行业是受限制行业 大于0 表示有限制
     * @param areaId
     * @return
     */
    @RequestMapping("/v1/product/findbusinarealimit/{areaId}")
    BaseResult<Integer> isExistAreaLimit(@PathVariable("areaId") String areaId);

}
