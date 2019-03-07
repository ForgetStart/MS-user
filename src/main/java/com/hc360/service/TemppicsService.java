package com.hc360.service;


import com.hc360.model.*;

import java.util.List;


/**
 * 临时图片服务接口层
 * @author hk
 *
 */
public interface TemppicsService {

	/**
	 * 获取临时图片列表
	 * @author hk
	 * @date 2019-02-23
	 * @return
	 * @throws Exception
	 */
	public List<Tmppic> getTmpRecord(long sessionid)throws Exception;

	/**
	 * 获取临时的sessionid
	 * @author hk
	 * @date 2019-03-07
	 * @throws
	 * @return
	 */
	public Long getUploadSessionId() throws Exception;

}
