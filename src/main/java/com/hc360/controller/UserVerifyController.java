package com.hc360.controller;

import com.hc360.AppConstants;
import com.hc360.common.ReturnCode;
import com.hc360.common.constants.BusinConstants;
import com.hc360.restful.fallback.ProductService;
import com.hc360.service.UserMessageService;
import com.hc360.vo.BusinLimitParam;
import com.hc360.vo.CorTable;
import com.hc360.vo.OnCorTable;
import com.hc360.vo.result.BaseResult;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Resource
    private ProductService productService;

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
            log.error("判断用户是否被冻结异常", e);
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

        if (pid == null) {
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
            log.error("获取主营行业是否完整异常", e);
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
    @RequestMapping("/company/complete/{providerid}/{sourcetypeid}")
    @ResponseBody
    public BaseResult<Boolean> isCompanyComplete(@PathVariable("providerid") Long pid, @PathVariable("sourcetypeid") String sourcetypeid) {
        BaseResult<Boolean> result = new BaseResult<>();

        if (pid == null) {
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
           int onCorTableCount = userMessageService.checkIsMakeupInfoUserToOnCorTable(pid, sourcetypeid);
           if(onCorTableCount > 0){
               onCorTableCount = userMessageService.checkIsMakeupInfoUserToCorTable(pid, sourcetypeid);
           }

           if(onCorTableCount > 0){
               result.setData(false);
               result.setErrcode(ReturnCode.OK.getErrcode());
           }else{
               result.setData(true);
               result.setErrcode(ReturnCode.OK.getErrcode());
           }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("获取公司信息是否完整异常", e);
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

        if (pid == null) {
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
            log.error("获取判断当前用户是否非大陆用户异常", e);
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

        if (pid == null || userId == null) {
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
            log.error("获取判断当前用户是否简单注册用户异常", e);
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

        if (pid == null) {
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
            log.error("判断当前用户是否在白名单中异常", e);
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

        if (pid == null) {
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
            log.error("判断当前用户是否绑定手机异常", e);
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }

        return result;
    }


    /**
     * 判断当前用户是否已实名认证
     *
     * @param pid
     * @return
     */
    @RequestMapping("/realauth/{providerid}")
    @ResponseBody
    public BaseResult<Boolean> isRealAuth(@PathVariable("providerid") Long pid) {
        BaseResult<Boolean> result = new BaseResult<>();

        if (pid == null) {
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            boolean isRealAuth = userMessageService.isRealAuth(pid);
            result.setData(isRealAuth);
            result.setErrcode(ReturnCode.OK.getErrcode());
        } catch (Exception e) {
            log.error("断当前用户是否已实名认证异常", e);
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }
        return result;
    }


    /**
     * 据账号id判断该账号是否存在发布商机的数目限制
     * @param pid
     * @return
     */
    @RequestMapping("/isproviderlimit/{providerid}")
    @ResponseBody
    public BaseResult<Boolean> isExistProviderLimit(@PathVariable("providerid") Long pid) {
        BaseResult<Boolean> result = new BaseResult<>();

        if (pid == null) {
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        try {
            boolean isExistProviderLimit = userMessageService.isExistProviderLimit(pid);
            result.setData(isExistProviderLimit);
            result.setErrcode(ReturnCode.OK.getErrcode());
        } catch (Exception e) {
            log.error("据账号id判断该账号是否存在发布商机的数目限制异常", e);
            result.setErrcode(ReturnCode.ERROR_Exception.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_Exception.getErrmsg());
        }
        return result;
    }


    /**
     * 商机上限检查
     * @param businLimitParam
     * @return
     */
    @RequestMapping("/findBusinLimit")
    @ResponseBody
    public BaseResult<String> findBusinLimit(@RequestBody BusinLimitParam businLimitParam){
        BaseResult<String> result = new BaseResult<>();
        String msg = null;
        String supcatid = businLimitParam.getSupcatid();
        if(null == businLimitParam){
            result.setErrcode(ReturnCode.ERROR_PARAM.getErrcode());
            result.setErrmsg(ReturnCode.ERROR_PARAM.getErrmsg());
            return result;
        }

        int userLimit = 0;
        businLimitParam.setSupcatid(null);
        //获取用户发送商机上限
        BaseResult<Integer> userLimitResult = productService.findBusinLimit(businLimitParam);
        if(userLimitResult.getErrcode() == 0 && null != userLimitResult.getData()){
            userLimit = userLimitResult.getData();
        }

        boolean isArea = "018".equals(businLimitParam.getAreaId());     //电子行业代码

        if("0".equals(businLimitParam.getSorttag())){//如果是供应商机
            //普通行业收费会员发布商机上限100000、电子行业上限5000000
            int j = businLimitParam.getMemberType() >= AppConstants.MMT_MEMBER_MMT ? isArea ?
                    BusinConstants.ETC_BUSIN_FEE_MAXNUM : BusinConstants.BUSIN_FEE_MAXNUM : BusinConstants.BUSIN_FREE_MAXNUM;
            /** 判断当前用户是否所在行业是受限制行业, 或者是该账号是受限制账号, 是的话重新设置上限 */
            int areaLimit = 0;
            BaseResult<Integer> areaLimitResult = productService.isExistAreaLimit(businLimitParam.getSupcatid());
            if(areaLimitResult.getErrcode() == 0 && null != areaLimitResult.getData()){
                areaLimit = areaLimitResult.getData();
            }

            if ( (areaLimit > 0 || userMessageService.isExistProviderLimit(businLimitParam.getProviderId()))&&
                    businLimitParam.getMemberType() >= AppConstants.MMT_MEMBER_MMT) {
                j = BusinConstants.LIMI_BUSIN_FEE_MAXNUM;
            }

            if (userLimit >= j) {
                msg = "对不起，你的商机数量已经超过上限" + j + "条，请删除无效商机后再继续发布新的商机！";
                result.setData(msg);
                result.setErrcode(ReturnCode.OK.getErrcode());
                return result;
            }
            if (StringUtils.isNotBlank(supcatid)) {
                /** 但是发布的商机在产品分类下不能超过10000 电子行业不能超过100000*/
                int cat_j = isArea ? BusinConstants.ETC_BUSIN_SUPCAT_MAXNUM : BusinConstants.BUSIN_SUPCAT_MAXNUM;
                int userSupcatLimit = 0;
                BaseResult<Integer> userSupcatLimitResult = productService.findBusinLimit(businLimitParam);
                if(userSupcatLimitResult.getErrcode() == 0 && null != userSupcatLimitResult.getData()){
                    userSupcatLimit = userSupcatLimitResult.getData();
                }
                if(userSupcatLimit >= cat_j){
                    msg = "您选择的产品分类下的商机数量已达上限，请更换其他分类。";
                    result.setData(msg);
                    result.setErrcode(ReturnCode.OK.getErrcode());
                    return result;
                }
            }
        }else if("1".equals(businLimitParam.getSorttag())){
            int j = BusinConstants.BUSIN_BUY_MAXNUM;
            if (userLimit >= j) {
                msg = "对不起，你的商机数量已经超过上限"+j+"条，请删除无效商机后再继续发布新的商机！";
                result.setData(msg);
                result.setErrcode(ReturnCode.OK.getErrcode());
                return result;
            }
        }

        result.setData(msg);
        result.setErrcode(ReturnCode.OK.getErrcode());
        return result;
    }



}
