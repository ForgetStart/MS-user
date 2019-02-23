package com.hc360.service.impl;

import com.hc360.dao.UserInfoMapper;
import com.hc360.mmt.db.dao.common.market.SearchScreenKeyword;
import com.hc360.service.UserMessageService;
import com.hc360.vo.CorBackListVo;
import com.hc360.vo.MainArea;
import com.hc360.vo.OnCorTable;
import com.hc360.vo.CorTable;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
        return SearchScreenKeyword.getAllowScreenKeyword(providerId);
    }

    @Override
    public List<MainArea> findMainArea() throws Exception {
        return userInfoMapper.findMainArea();
    }

    @Override
    public String findAreaNameByAreaCode(String areaCode) throws Exception {
        return userInfoMapper.findAreaNameByAreaCode(areaCode);
    }


}
