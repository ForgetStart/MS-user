package com.hc360.controller;

import com.hc360.service.UserMessageService;
import com.hc360.vo.CorTable;
import com.hc360.vo.OnCorTable;
import com.hc360.vo.result.BaseResult;
import org.apache.commons.lang.StringUtils;
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
    public BaseResult isSystemFrozen(@PathVariable("providerid") Long pid) {

        if (pid == null) return BaseResult.illegalParam("providerid 不能为空");

        BaseResult baseResult = null;
        try {
            boolean isSystemFrozen = userMessageService.isSystemFrozen(pid, "0");
            baseResult = BaseResult.isSuccess(isSystemFrozen);
        } catch (Exception e) {
            baseResult = BaseResult.isFail("判断用户是否被冻结异常");
            e.printStackTrace();
        }

        return baseResult;
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
    public BaseResult isComplete(@PathVariable("providerid") Long pid) {
        if (pid == null) return BaseResult.illegalParam("providerid 不能为空");

        try {
            OnCorTable onCorTable = userMessageService.findOnCorTableByProviderId(pid);
            if (onCorTable != null) {
                if (null != onCorTable.getAreaid() && !"235".equals(onCorTable.getAreaid())) {
                    return BaseResult.isSuccess(true, "主营行业完整");
                }
            }

            //获取审核已通过的corTable表中数据
            CorTable corTable = userMessageService.findCorTableByProviderIdAndChecked(pid);
            if (corTable != null) {
                if (null != corTable.getAreaid() && !"235".equals(corTable.getAreaid())) {
                    return BaseResult.isSuccess(true, "主营行业完整");
                } else {
                    return BaseResult.isSuccess(false, "主营行业不完整");
                }
            }

            return BaseResult.isSuccess(false, "主营行业不完整");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.isFail("获取主营行业是否完整异常");
        }
    }


    /**
     * 判断公司信息是否完整(公司名称、联系人)
     *
     * @param pid
     * @return
     */
    @RequestMapping("/company/complete/{providerid}")
    @ResponseBody
    public BaseResult isCompanyComplete(@PathVariable("providerid") Long pid) {
        if (pid == null) return BaseResult.illegalParam("providerid 不能为空");

        try {
            OnCorTable onCorTable = userMessageService.findOnCorTableByProviderId(pid);
            if (onCorTable != null) {
                if (StringUtils.isNotBlank(onCorTable.getName()) && StringUtils.isNotBlank(onCorTable.getContacter())) {
                    return BaseResult.isSuccess(true, "公司信息完整");
                }
            }

            //获取审核已通过的corTable表中数据
            CorTable corTable = userMessageService.findCorTableByProviderIdAndChecked(pid);
            if (corTable != null) {
                if (StringUtils.isNotBlank(corTable.getName()) && StringUtils.isNotBlank(corTable.getContacter())) {
                    return BaseResult.isSuccess(true, "公司信息完整");
                } else {
                    return BaseResult.isSuccess(false, "公司信息不完整");
                }
            }

            return BaseResult.isSuccess(false, "公司信息不完整");
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.isFail("获取公司信息是否完整异常");
        }
    }

    /**
     * 判断当前用户是否非大陆用户
     *
     * @param pid
     * @return
     */
    @RequestMapping("/district/{providerid}")
    @ResponseBody
    public BaseResult isDistrict(@PathVariable("providerid") Long pid) {
        if (pid == null) return BaseResult.illegalParam("providerid 不能为空");

        try {
            Boolean isDistrict = userMessageService.isDistrictByProviderid(pid);
            return BaseResult.isSuccess(isDistrict);
        } catch (Exception e) {
            e.printStackTrace();

            return BaseResult.isFail("获取判断当前用户是否非大陆用户异常");
        }
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
    public BaseResult isSimple(@PathVariable("providerid") Long pid, @PathVariable("userId") Long userId) {
        if (pid == null || userId == null) return BaseResult.illegalParam("providerid 为空或 userId 为空");

        try {
            boolean isSimpleUser = userMessageService.isSimpleUserByUserId(userId, pid);
            return BaseResult.isSuccess(isSimpleUser);
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResult.isFail("获取判断当前用户是否简单注册用户异常");
        }
    }

    /**
     * 判断当前用户是否在白名单中
     * @param pid
     * @return
     */
    @RequestMapping("/white/list/{providerid}")
    @ResponseBody
    public BaseResult isWhileList(@PathVariable("providerid") Long pid){
        if (pid == null) return BaseResult.illegalParam("providerid 不能为空");
        try {
            boolean iswhiteList = userMessageService.isWhiteList(pid);
            return BaseResult.isSuccess(iswhiteList);
        }catch (Exception e){
            e.printStackTrace();
            return BaseResult.isFail("判断当前用户是否在白名单中异常");
        }
    }
}
