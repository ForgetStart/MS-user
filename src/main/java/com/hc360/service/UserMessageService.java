package com.hc360.service;

import com.hc360.vo.CorTable;
import com.hc360.vo.OnCorTable;

/**
 * @Auther: Administrator
 * @Date: 2019/2/20 18:05
 * @Description:
 */
public interface UserMessageService {

    OnCorTable findOnCorTableByProviderId(Long providerId) throws Exception;

    CorTable findCorTableByProviderId(Long providerId) throws Exception;

    /**
     * 查询用户是否在黑名单中(是否被冻结)
     *
     * @param providerId
     * @param state
     * @return
     * @throws Exception
     */
    boolean isSystemFrozen(long providerId, String state) throws Exception;

    /**
     * 判断当前用户是否非大陆用户
     * @param providerId
     * @return
     * @throws Exception
     */
    boolean isDistrictByProviderid(Long providerId) throws Exception;

    /**
     * 判断向前用户是否是简单注册用户
     * @param userId
     * @return
     * @throws Exception
     */
    boolean isSimpleUserByUserId(Long userId, Long providerId) throws Exception;
}
