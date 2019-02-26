package com.hc360.controller;

import com.hc360.common.ReturnCode;
import com.hc360.service.UserMessageService;
import com.hc360.vo.CorTable;
import com.hc360.vo.OnCorTable;
import com.hc360.vo.result.BaseResult;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Auther: Administrator
 * @Date: 2019/2/21 16:38
 * @Description:用户的权限验证服务
 */
@Controller
@RequestMapping("/v1/user")
public class UserVerifyController {

    private static final Log log = LogFactory.getLog("UserVerifyController");

    @Resource
    private UserMessageService userMessageService;

    /**
     * 查询用户是否在黑名单中(是否被冻结)
     *
     * @param pid
     * @return
     */
    @RequestMapping("/verify/{providerid}")
    @ResponseBody
    public BaseResult<Boolean> isSystemFrozen(@PathVariable("providerid") Long pid) {
        BaseResult<Boolean> result = new BaseResult<>();

        if (pid == null) {
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            boolean isSystemFrozen = userMessageService.isSystemFrozen(pid, "0");
            result.setData(isSystemFrozen);
            result.setErrcode(ReturnCode.OK.getErrcode());
        } catch (Exception e) {
            log.error("判断用户是否被冻结异常");
            e.printStackTrace();
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }

    /**
     * 判断主营行业是否完整
     * 先查询OnCorTable表，
     * 若不存在符合的数据，
     * 在查询CorTable表中审核通过的（若能查询到，证明是还未推送)，所以此时已CorTable表中数据为主
     * 若存在符合的数据，则直接以OnCorTable表数据为主
     *
     * @param pid
     * @return
     */
    @RequestMapping("/industry/complete/{providerid}")
    @ResponseBody
    public BaseResult<Boolean> isComplete(@PathVariable("providerid") Long pid) {
        BaseResult<Boolean> result = new BaseResult<>();

        if (pid == null){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            OnCorTable onCorTable = userMessageService.findOnCorTableByProviderId(pid);
            if (onCorTable != null) {
                if (null != onCorTable.getAreaid() && !"235".equals(onCorTable.getAreaid())) {
                    result.setData(true);
                    result.setErrcode(ReturnCode.OK.getErrcode());
                    return result;
                }
            }

            //获取审核已通过的corTable表中数据
            CorTable corTable = userMessageService.findCorTableByProviderIdAndChecked(pid);
            if (corTable != null) {
                if (null != corTable.getAreaid() && !"235".equals(corTable.getAreaid())) {
                    result.setData(true);
                    result.setErrcode(ReturnCode.OK.getErrcode());
                    return result;
                } else {
                    result.setData(false);
                    result.setErrcode(ReturnCode.OK.getErrcode());
                    return result;
                }
            }

            result.setData(false);
            result.setErrcode(ReturnCode.OK.getErrcode());
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取主营行业是否完整异常");
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }


    /**
     * 判断公司信息是否完整(公司名称、联系人)
     *
     * @param pid
     * @return
     */
    @RequestMapping("/company/complete/{providerid}")
    @ResponseBody
    public BaseResult<Boolean> isCompanyComplete(@PathVariable("providerid") Long pid) {
        BaseResult<Boolean> result = new BaseResult<>();

        if (pid == null){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            OnCorTable onCorTable = userMessageService.findOnCorTableByProviderId(pid);
            if (onCorTable != null) {
                if (StringUtils.isNotBlank(onCorTable.getName()) && StringUtils.isNotBlank(onCorTable.getContacter())) {
                    result.setData(true);
                    result.setErrcode(ReturnCode.OK.getErrcode());
                    return result;
                }
            }

            //获取审核已通过的corTable表中数据
            CorTable corTable = userMessageService.findCorTableByProviderIdAndChecked(pid);
            if (corTable != null) {
                if (StringUtils.isNotBlank(corTable.getName()) && StringUtils.isNotBlank(corTable.getContacter())) {
                    result.setData(true);
                    result.setErrcode(ReturnCode.OK.getErrcode());
                    return result;
                } else {
                    result.setData(false);
                    result.setErrcode(ReturnCode.OK.getErrcode());
                    return result;
                }
            }

            result.setData(false);
            result.setErrcode(ReturnCode.OK.getErrcode());
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取公司信息是否完整异常");
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }

    /**
     * 判断当前用户是否非大陆用户
     *
     * @param pid
     * @return
     */
    @RequestMapping("/district/{providerid}")
    @ResponseBody
    public BaseResult<Boolean> isDistrict(@PathVariable("providerid") Long pid) {
        BaseResult<Boolean> result = new BaseResult<>();

        if (pid == null){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            Boolean isDistrict = userMessageService.isDistrictByProviderid(pid);
            result.setData(isDistrict);
            result.setErrcode(ReturnCode.OK.getErrcode());

        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取判断当前用户是否非大陆用户异常");
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }

    /**
     * 判断当前用户是否是简单注册用户
     *
     * @param pid
     * @param userId
     * @return
     */
    @RequestMapping("/simple/{providerid}/{userId}")
    @ResponseBody
    public BaseResult<Boolean> isSimple(@PathVariable("providerid") Long pid, @PathVariable("userId") Long userId) {
        BaseResult<Boolean> result = new BaseResult<>();

        if (pid == null || userId == null){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            boolean isSimpleUser = userMessageService.isSimpleUserByUserId(userId, pid);
            result.setData(isSimpleUser);
            result.setErrcode(ReturnCode.OK.getErrcode());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取判断当前用户是否简单注册用户异常");
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }

    /**
     * 判断当前用户是否在白名单中
     *
     * @param pid
     * @return
     */
    @RequestMapping("/white/list/{providerid}")
    @ResponseBody
    public BaseResult<Boolean> isWhileList(@PathVariable("providerid") Long pid) {
        BaseResult<Boolean> result = new BaseResult<>();

        if (pid == null){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            boolean iswhiteList = userMessageService.isWhiteList(pid);
            result.setData(iswhiteList);
            result.setErrcode(ReturnCode.OK.getErrcode());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("判断当前用户是否在白名单中异常");
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }

    /**
     * 判断当前用户是否绑定手机
     *
     * @param pid
     * @return
     */
    @RequestMapping("/bind/mobile/{providerid}")
    @ResponseBody
    public BaseResult<Boolean> isBindMobile(@PathVariable("providerid") Long pid) {

        BaseResult<Boolean> result = new BaseResult<>();

        if (pid == null){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            boolean isBind = userMessageService.isBindMobile(pid, 1L);
            result.setData(isBind);
            result.setErrcode(ReturnCode.OK.getErrcode());
        } catch (Exception e) {
            e.printStackTrace();
            log.error("判断当前用户是否绑定手机异常");
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }
}
