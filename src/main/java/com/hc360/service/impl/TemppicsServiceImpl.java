package com.hc360.service.impl;

import com.hc360.dao.TemppicsMapper;
import com.hc360.model.Tmppic;
import com.hc360.service.TemppicsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 临时图片服务接口实现类
 * @author hk
 *
 */
@Service
public class TemppicsServiceImpl implements TemppicsService {

	@Resource
	TemppicsMapper temppicsMapper;


	@Override
	public List<Tmppic> getTmpRecord(long sessionid) throws Exception {
		return temppicsMapper.getTmpRecord(sessionid);
	}

	@Override
	public Long getUploadSessionId() throws Exception {
		return temppicsMapper.getUploadSessionId();
	}
}
