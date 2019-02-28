package com.hc360.service;


import com.hc360.model.CorSubscribeConf;
import com.hc360.model.FirstoperateLog;
import com.hc360.model.SubscribTable;
import com.hc360.vo.SubscribeParamVO;


/**
 *  商机邮件订阅接口层
 * @author hk
 * @date 2019-02-28
 */
public interface BusinSubscribeService {

	/**
	 * 判断关键词、分类是否已经被订阅，用于简单订阅
	 * @param providerid
	 * @param keyword
	 * @param supcatid
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public String isRepeatKeyWord(long providerid, String keyword, String supcatid, long id, String infotype) throws Exception;

	/**
	 * 保存商机订阅
	 * @param subscribTable
	 * @return
	 * @throws Exception
	 */
	public int saveSubscribTable(SubscribTable subscribTable)throws Exception;

	/**
	 * 保存第一发布商机订阅
	 * @param firstoperateLog
	 * @return
	 * @throws Exception
	 */
	public int saveOperateLog(FirstoperateLog firstoperateLog)throws Exception;


	/**
	 * 保存会员订阅配置表
	 * @param corSubscribeConf
	 * @return
	 * @throws Exception
	 */
	public void saveCorSubscribeConf(CorSubscribeConf corSubscribeConf)throws Exception;

	/**
	 * 查询企业已经订阅的关键词个数
	 * @param providerid
	 * @return
	 * @throws Exception
	 */
	public int getSubKewordCount(long providerid)throws Exception;

	/**
	 * 察看是否是首次订阅
	 * @param providerid 用户
	 * @param operate 订阅类型
	 * 1:订阅关键字
	 * @return
	 * @throws Exception
	 */
	public boolean isFirstOperate(long providerid,int operate)throws Exception;


	/**
	 * 查询用户订阅配置信息
	 * @param providerid 用户
	 * @return
	 * @throws Exception
	 */
	public CorSubscribeConf findCorSubscribeConf(long providerid)throws Exception;


	/**
	 * 更新用户订阅配置信息
	 * @param corSubscribeConf
	 * @return
	 * @throws Exception
	 */
	public int updateCorSubscribeConf(CorSubscribeConf corSubscribeConf)throws Exception;

	/**
	 * 保存订阅关键字商机
	 *
	 * @param param
	 * @param subtable
	 * @return
	 * @throws Exception
	 */
	public void saveSubscribTable(SubscribeParamVO param, SubscribTable subtable) throws Exception;


}
