package com.hc360.controller;

import com.hc360.service.UserMessageService;
import com.hc360.vo.MainArea;
import com.hc360.vo.OnCorTable;
import com.hc360.vo.result.BaseResult;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/2/20 17:36
 * @Description:用户基本信息服务
 */

@Controller
@RequestMapping("/v1/user")
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
            baseResult = BaseResult.isFail("查询用户信息异常!");
        }

        return baseResult;
    }


    /**
     * 根据动态条件，查询用户基本信息
     * @param onCorTable
     * @return
     */
    @RequestMapping("/base")
    @ResponseBody
    public BaseResult findUserBaseByOnCorTable(@RequestBody OnCorTable onCorTable){

        try {
            OnCorTable baseUser = userMessageService.findUserBaseByOnCorTable(onCorTable);
            return BaseResult.isSuccess(baseUser);
        }catch (Exception e){
            e.printStackTrace();
            return BaseResult.isFail("获取用户基本信息异常!");
        }
    }

    /**
     * 获取用户屏蔽词白名单
     * @param pid
     * @return
     */
    @RequestMapping("/allowscreen/keyword{providerid}")
    @ResponseBody
    public BaseResult findUserBaseByOnCorTable(@PathVariable("providerid") Long pid){
        if (pid == null) return BaseResult.illegalParam("providerid 不能为空");

        try {
            List<String> allowList = userMessageService.getAllowScreenKeyword(pid);
            return BaseResult.isSuccess(allowList);
        }catch (Exception e){
            e.printStackTrace();
            return BaseResult.isFail("获取用户屏蔽词白名单异常");
        }
    }


    /**
     * 获取所有主营行业信息
     * @return
     */
    @RequestMapping("/all/mainarea")
    @ResponseBody
    public BaseResult findAllMainArea(){
        try {
            List<MainArea> mainAreas = userMessageService.findMainArea();
            return BaseResult.isSuccess(mainAreas);
        }catch (Exception e){
            e.printStackTrace();
            return BaseResult.isFail("获取所有主营行业异常");
        }
    }


    /**
     * 根据行业编号查询行业名称
     * @param areacode
     * @return
     */
    @RequestMapping("/areaname/{areacode}")
    @ResponseBody
    public BaseResult findAreaNameByAreaCode(@PathVariable("areacode") String areacode){
        if(StringUtils.isBlank(areacode)) return BaseResult.illegalParam("areacode 为空");

        try {
            String areaName = userMessageService.findAreaNameByAreaCode(areacode);
            return BaseResult.isSuccess(areaName);
        }catch (Exception e){
            e.printStackTrace();
            return BaseResult.isFail("根据行业编号查询行业名称异常");
        }

    }

}
