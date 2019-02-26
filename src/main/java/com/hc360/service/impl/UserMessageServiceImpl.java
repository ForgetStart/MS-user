package com.hc360.service.impl;

import com.hc360.common.util.SearchkeyWordUtil;
import com.hc360.dao.UserInfoMapper;
import com.hc360.service.UserMessageService;
import com.hc360.vo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//import com.hc360.mmt.db.dao.common.market.SearchScreenKeyword;

/**
 * @Auther: Administrator
 * @Date: 2019/2/20 18:06
 * @Description:
 */

@Service
public class UserMessageServiceImpl implements UserMessageService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public OnCorTable findOnCorTableByProviderId(Long providerId) throws Exception {
        return userInfoMapper.findOnCorTableByProviderId(providerId);
    }

    @Override
    public OnCorTable findUserBaseByOnCorTable(OnCorTable onCorTable) throws Exception {
        return userInfoMapper.findUserBaseByOnCorTable(onCorTable);
    }

    @Override
    public CorTable findCorTableByProviderIdAndChecked(Long providerId) throws Exception {
        return userInfoMapper.findCorTableByProviderIdAndChecked(providerId);
    }

    /**
     * 查询用户是否在黑名单中(是否被冻结)
     * @param providerId
     * @param state
     * @return
     * @throws Exception
     */
    @Override
    public boolean isSystemFrozen(long providerId, String state) throws Exception {
        //获取冻结记录
        List<CorBackListVo> backList = userInfoMapper.findCorBack(providerId, state);

        if(null != backList){
            for(CorBackListVo back:backList){
                if("0".equals(back.getIsfreeze()) && "1".equals(back.getFlag())){       //正常加入黑名单并且是系统默认的
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 判断当前用户是否非大陆用户
     * @param providerId
     * @return
     * @throws Exception
     */
    @Override
    public boolean isDistrictByProviderid(Long providerId) throws Exception {
        int count = userInfoMapper.isDistrictByProviderid(providerId);
        return count > 0;
    }

    /**
     * 判断向前用户是否是简单注册用户
     * @param userId
     * @return
     * @throws Exception
     */
    @Override
    public boolean isSimpleUserByUserId(Long userId, Long providerId) throws Exception {
        OnCorTable onCorTable = userInfoMapper.findOnCorTableByProviderId(providerId);

        if(onCorTable == null){
            int count = userInfoMapper.isSimpleUserByProviderId(userId);
            if(count > 0){
                return true;
            }
        }
        return false;
    }

    /**
     * 判断当前用户是否在白名单中
     *      01--商机操作白名单标识
     * @param providerId
     * @return
     * @throws Exception
     */
    @Override
    public boolean isWhiteList(Long providerId) throws Exception {
        List<Long> whiteList = userInfoMapper.findOperateWhiteListByProviderId(providerId);

        if(whiteList != null && whiteList.size() > 0){
            if(whiteList.contains(01)) return true;
        }
        return false;
    }


    /**
     * 获取用户屏蔽词白名单
     * @param providerId
     * @return
     * @throws Exception
     */
    @Override
    public List<String> getAllowScreenKeyword(Long providerId) throws Exception {
        return SearchkeyWordUtil.getAllowScreenKeyword(providerId);
    }

    /**
     * 获取所有主营行业
     * @return
     * @throws Exception
     */
    @Override
    public List<MainArea> findMainArea() throws Exception {
        return userInfoMapper.findMainArea();
    }

    /**
     * 根据行业编号查询行业名称
     * @param areaCode
     * @return
     * @throws Exception
     */
    @Override
    public String findAreaNameByAreaCode(String areaCode) throws Exception {
        return userInfoMapper.findAreaNameByAreaCode(areaCode);
    }

    /**
     * 判断当前用户是否绑定手机
     * @param providerId
     * @param isBind
     * @return
     * @throws Exception
     */
    @Override
    public boolean isBindMobile(Long providerId, Long isBind) throws Exception {
        int count = userInfoMapper.isBindMobile(providerId, isBind);
        if(count > 0) return true;

        return false;
    }

    /**
     * 取得最新留言数
     * @param recvparam
     * @return
     * @throws Exception
     */
    @Override
    public int findLeaveWordCount(RecvnotesParam recvparam) throws Exception {
        return userInfoMapper.findLeaveWordCount(recvparam);
    }

    @Override
    public CityVo findCity(CityVo cityVo) throws Exception {
        //先查询缓存
        return userInfoMapper.findCity(cityVo);
    }

    @Override
    public ProvinceVo findProvince(ProvinceVo provinceVo) throws Exception {
        //先查询缓存

        return userInfoMapper.findProvince(provinceVo);
    }


}
