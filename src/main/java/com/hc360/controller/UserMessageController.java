package com.hc360.controller;

import com.hc360.common.ReturnCode;
import com.hc360.service.UserMessageService;
import com.hc360.vo.*;
import com.hc360.vo.result.BaseResult;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    private static final Log log =  LogFactory.getLog("UserMessageController");

    @Resource
    private UserMessageService userMessageService;

    @RequestMapping("/userInfo/{providerid}")
    @ResponseBody
    public BaseResult<OnCorTable> findOnCorTableByProviderId(@PathVariable("providerid") long pid) {
        BaseResult<OnCorTable> baseResult = new BaseResult<>();
        try {
            OnCorTable onCorTable = userMessageService.findOnCorTableByProviderId(pid);
            baseResult.setData(onCorTable);
            baseResult.setErrcode(ReturnCode.OK.getErrcode());

        } catch (Exception e) {
            log.error("查询用户信息异常!",e);
            baseResult.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            baseResult.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return baseResult;
    }


    /**
     * 根据动态条件，查询用户基本信息
     *
     * @param onCorTable
     * @return
     */
    @RequestMapping("/base")
    @ResponseBody
    public BaseResult<OnCorTable> findUserBaseByOnCorTable(@RequestBody OnCorTable onCorTable) {
        BaseResult<OnCorTable> baseResult = new BaseResult<>();

        try {
            OnCorTable baseUser = userMessageService.findUserBaseByOnCorTable(onCorTable);
            baseResult.setData(baseUser);
            baseResult.setErrcode(ReturnCode.OK.getErrcode());

        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取用户基本信息异常!",e);
            baseResult.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            baseResult.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return baseResult;
    }

    /**
     * 获取用户屏蔽词白名单
     *
     * @param pid
     * @return
     */
    @RequestMapping("/allowscreen/keyword/{providerid}")
    @ResponseBody
    public BaseResult<List<String>> findUserBaseByOnCorTable(@PathVariable("providerid") Long pid) {
        BaseResult<List<String>> result = new BaseResult<>();

        if (pid == null){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            List<String> allowList = userMessageService.getAllowScreenKeyword(pid);
            result.setData(allowList);
            result.setErrcode(ReturnCode.OK.getErrcode());
        } catch (Exception e) {
            log.error("获取用户屏蔽词白名单异常",e);
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }


    /**
     * 获取所有主营行业信息
     *
     * @return
     */
    @RequestMapping("/all/mainarea")
    @ResponseBody
    public BaseResult<List<MainArea>> findAllMainArea() {
        BaseResult<List<MainArea>> result = new BaseResult<>();
        try {
            List<MainArea> mainAreas = userMessageService.findMainArea();
            result.setData(mainAreas);
            result.setErrcode(ReturnCode.OK.getErrcode());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取所有主营行业异常", e);
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }


    /**
     * 根据行业编号查询行业名称
     *
     * @param areacode
     * @return
     */
    @RequestMapping("/areaname/{areacode}")
    @ResponseBody
    public BaseResult<String> findAreaNameByAreaCode(@PathVariable("areacode") String areacode) {
        BaseResult<String> result = new BaseResult<>();

        if (StringUtils.isBlank(areacode)){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            String areaName = userMessageService.findAreaNameByAreaCode(areacode);
            result.setData(areaName);
            result.setErrcode(ReturnCode.OK.getErrcode());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("根据行业编号查询行业名称异常", e);
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }


    /**
     * 取得最新留言数
     * @param pid
     * @return
     */
    @RequestMapping("/leave/word/{providerid}")
    @ResponseBody
    public BaseResult<Integer> findLeaveWordCount(@PathVariable("providerid") Long pid) {
        BaseResult<Integer> result = new BaseResult<>();

        if (pid == null){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        RecvnotesParam recvparam = new RecvnotesParam();
        recvparam.setProvinceid(pid);
        recvparam.setAnymoussender(01);
        recvparam.setNotSysnote(true);
        recvparam.setInfotype("1");
        //1个月内的报价留言
        recvparam.setDatetype("2");

        try {
            int count = userMessageService.findLeaveWordCount(recvparam);
            result.setData(count);
            result.setErrcode(ReturnCode.OK.getErrcode());
        } catch (Exception e) {
            e.printStackTrace();
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
            log.error("取得最新留言数异常",e);
        }

        return result;
    }

    @RequestMapping(value = "/city", method = RequestMethod.POST)
    @ResponseBody
    public BaseResult<CityVo> findCity(@RequestBody CityVo cityVo) {
        BaseResult<CityVo> result = new BaseResult<>();

        try {
            CityVo city = userMessageService.findCity(cityVo);
            result.setData(city);
            result.setErrcode(ReturnCode.OK.getErrcode());

        }catch (Exception e){
            e.printStackTrace();
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
            log.error("查询城市异常", e);
        }

        return result;
    }

    @RequestMapping(value = "/province", method = RequestMethod.POST)
    @ResponseBody
    public BaseResult<ProvinceVo> findProvince(@RequestBody ProvinceVo provinceVo) {

        BaseResult<ProvinceVo> result = new BaseResult<>();

        try {
            ProvinceVo province = userMessageService.findProvince(provinceVo);
            result.setData(province);
            result.setErrcode(ReturnCode.OK.getErrcode());
        }catch (Exception e){
            e.printStackTrace();
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
            log.error("查询省份异常");
        }

        return result;
    }

}
