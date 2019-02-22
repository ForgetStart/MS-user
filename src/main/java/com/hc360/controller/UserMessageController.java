package com.hc360.controller;

import com.hc360.service.UserMessageService;
import com.hc360.vo.OnCorTable;
import com.hc360.vo.result.BaseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Auther: Administrator
 * @Date: 2019/2/20 17:36
 * @Description:用户基本信息服务
 */

@Controller
@RequestMapping("/v1/base/user")
public class UserMessageController {

    @Resource
    private UserMessageService userMessageService;

    @RequestMapping("/userInfo/{providerid}")
    @ResponseBody
    public BaseResult findOnCorTableByProviderId(@PathVariable("providerid") long pid){
        BaseResult baseResult = null;
        try {
            OnCorTable onCorTable = userMessageService.findOnCorTableByProviderId(pid);
            baseResult = BaseResult.isSuccess(onCorTable);

        }catch (Exception e){
            baseResult = BaseResult.isFail("查询用户基本信息异常!");
        }

        return baseResult;
    }

}
