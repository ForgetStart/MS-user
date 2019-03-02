package com.hc360.restful.fallback;

import com.hc360.vo.BusinLimitParam;
import com.hc360.vo.result.BaseResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 调用 ms-productpub-service服务
 */
@FeignClient(value="productpubservice")
public interface ProductService {
	

    @RequestMapping("/v1/product/findBusinLimit")
    BaseResult<Integer> findBusinLimit(@RequestBody BusinLimitParam businLimitParam);

    @RequestMapping("/v1/product/isExistAreaLimit/{areaId}")
    BaseResult<Integer> isExistAreaLimit(@PathVariable("areaId") String areaId);

}
