package com.hc360.service;

import com.hc360.vo.CorTable;
import com.hc360.vo.MainArea;
import com.hc360.vo.OnCorTable;
import com.hc360.vo.RecvnotesParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/2/20 18:05
 * @Description:
 */
public interface UserMessageService {

    OnCorTable findOnCorTableByProviderId(Long providerId) throws Exception;

    /**
     * 根据动态条件，查询用户基本信息
     * @param onCorTable
     * @return
     * @throws Exception
     */
    OnCorTable findUserBaseByOnCorTable(OnCorTable onCorTable) throws Exception;

    CorTable findCorTableByProviderIdAndChecked(Long providerId) throws Exception;

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
     * 判断当前用户是否是简单注册用户
     * @param userId
     * @return
     * @throws Exception
     */
    boolean isSimpleUserByUserId(Long userId, Long providerId) throws Exception;

    /**
     * 判断当前用户是否在白名单中
     * @param providerId
     * @return
     * @throws Exception
     */
    boolean isWhiteList(Long providerId) throws Exception;

    /**
     * 获取用户屏蔽词白名单
     * @param providerId
     * @return
     * @throws Exception
     */
    List<String> getAllowScreenKeyword(Long providerId) throws Exception;

    /**
     * 获取所有主营行业
     * @return
     * @throws Exception
     */
    List<MainArea> findMainArea() throws Exception;

    /**
     * 根据行业编号查询行业名称
     * @param areaCode
     * @return
     * @throws Exception
     */
    String findAreaNameByAreaCode(String areaCode) throws Exception;

    /**
     * 判断当前用户是否绑定手机
     * @param providerId
     * @param isBind
     * @return
     * @throws Exception
     */
    boolean isBindMobile(Long providerId, Long isBind) throws Exception;

    /**
     * 取得最新留言数
     * @param recvparam
     * @return
     * @throws Exception
     */
    int findLeaveWordCount(RecvnotesParam recvparam) throws Exception;
}
