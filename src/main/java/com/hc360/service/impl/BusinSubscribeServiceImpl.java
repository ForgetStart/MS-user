package com.hc360.service.impl;

import com.hc360.b2b.util.DateUtils;
import com.hc360.b2b.util.StringUtils;
import com.hc360.common.constants.SubscibeConstants;
import com.hc360.dao.BusinSubscribeMapper;
import com.hc360.model.CorSubscribeConf;
import com.hc360.model.FirstoperateLog;
import com.hc360.model.SubscribTable;
import com.hc360.service.BusinSubscribeService;
import com.hc360.vo.SubscribeParamVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 商机邮件订阅服务接口实现类
 * @author hk
 * @date 2019-02-28
 */
@Service
public class BusinSubscribeServiceImpl implements BusinSubscribeService {

	@Resource
	BusinSubscribeMapper businSubscribeMapper;

	@Override
	public String isRepeatKeyWord(long providerid, String keyword, String supcatid, long id, String infotype) throws Exception {
		String infotypeStr = null;
		List<SubscribTable> repeatKeyWordlList = businSubscribeMapper.isRepeatKeyWord(providerid, keyword, supcatid, id, infotype);
		if (repeatKeyWordlList != null && !repeatKeyWordlList.isEmpty()) {
			for (SubscribTable table : repeatKeyWordlList) {
				/*
				 * 原“0”，现“0”--》原 原“0”，现“1”--》“0，1” 原“0，1”，现“？”--》“0，1”
				 */
				if (infotypeStr == null) {
					infotypeStr = table.getInfotype();
				}
				if (table.getInfotype().equals("0,1")) {
					infotypeStr = table.getInfotype();
					break;
				} else if (!infotypeStr.equals(table.getInfotype())) {
					infotypeStr = "0,1";
				}
			}
		}
		return infotypeStr;
	}

	@Override
	public int saveSubscribTable(SubscribTable subscribTable) throws Exception {
		return businSubscribeMapper.saveSubscribTable(subscribTable);
	}

	@Override
	public int saveOperateLog(FirstoperateLog firstoperateLog) throws Exception {
		return businSubscribeMapper.saveOperateLog(firstoperateLog);
	}

	@Override
	public void saveCorSubscribeConf(CorSubscribeConf corSubscribeConf) throws Exception {
		businSubscribeMapper.saveCorSubscribeConf(corSubscribeConf);
	}

	@Override
	public int getSubKewordCount(long providerid) throws Exception {
		return businSubscribeMapper.getSubKewordCount(providerid);
	}

	@Override
	public boolean isFirstOperate(long providerid, int operate) throws Exception {
		int count =businSubscribeMapper.isFirstOperate(providerid,operate);
		return count<=0;
	}

	@Override
	public CorSubscribeConf findCorSubscribeConf(long providerid) throws Exception {
		return businSubscribeMapper.findCorSubscribeConf(providerid);
	}

	@Override
	public int updateCorSubscribeConf(CorSubscribeConf corSubscribeConf) throws Exception {
		return businSubscribeMapper.updateCorSubscribeConf(corSubscribeConf);
	}

	@Override
	public void saveSubscribTable(SubscribeParamVO param, SubscribTable subtable) throws Exception {


			//是否首次订阅
			if(businSubscribeMapper.isFirstOperate(param.getProviderid(), SubscibeConstants.SUB_KEYWORD_SUBTYPE)<=0){
				//首次订阅关键字，加财富积分.记录首次操作
				FirstoperateLog oplog = new FirstoperateLog();
				//操作代码(0 首次装修商铺 1 首次订阅关键字 2 首次订阅分类 3 首次订阅简报 )
				oplog.setOperate((long)SubscibeConstants.SUB_KEYWORD_SUBTYPE);
				oplog.setProviderid(param.getProviderid());
				oplog.setPubdate(DateUtils.getSysTimestamp());

				businSubscribeMapper.saveOperateLog(oplog);

			}
			//保存订阅信息
			businSubscribeMapper.saveSubscribTable(subtable);
			subtable.setId(subtable.getId());

			/** 延长订阅结束时间 2009-11-13*/
			renewMail(param.getProviderid(),true);

			//to do记录审计日志
//			LogService.writeOperLog(SessionInfo.getClientInfo().getOperId(),SubscibeConstants.SUBSCIBE_MOD_NAME,0,
//					SubscibeConstants.SUBSCIBE_OP_ADD_KEYWORD,
//					providerid,String.valueOf(subtable.getId()),userSession.getUserName(), userSession);
	}

	/**
	 *
	 * 重新开启订阅
	 *
	 * @param providerid  用户id
	 * @param isSetDate   是否只延时间(true代表用户订阅未到期，刷新订阅时间,false代表用户订阅到期，续订)
	 *
	 * @return
	 * @throws Exception
	 */
	public boolean renewMail(long providerid,boolean isSetDate)throws Exception {
		CorSubscribeConf conf =businSubscribeMapper.findCorSubscribeConf(providerid);
		String today = StringUtils.formatDate(new Date(), "yyyy-MM-dd");
		if(conf!=null){
			/** 如果只延长结束时间 */
			if(!isSetDate){
				conf.setIsmail(Long.parseLong(SubscibeConstants.EMAIL_ACTIVATED));
				conf.setRemaildate(DateUtils.getSysTimestamp());
			}
			conf.setModifydate(DateUtils.getSysTimestamp());
			conf.setIssend(SubscibeConstants.EMAIL_UNSEND);

			/** 续订时间记录为日期 */
			conf.setEnddate(DateUtils.addDateTime(DateUtils.getstrTimestamp(today,"yyyy-MM-dd"),"D",SubscibeConstants.END_DAY-1));

			businSubscribeMapper.updateCorSubscribeConf(conf);
		}
		else{
			conf = new CorSubscribeConf();
			conf.setId(providerid);
			conf.setIssend(SubscibeConstants.MAIL_ISSEND);
			conf.setIsmail(SubscibeConstants.MAIL_ISMAIL);
			conf.setModifydate(DateUtils.getSysTimestamp());
			conf.setFrequency(SubscibeConstants.MAIL_FREQUENCY);
			conf.setPubdate(DateUtils.getSysTimestamp());
			conf.setIssend(SubscibeConstants.EMAIL_UNSEND);
			/** 续订时间记录为日期 */
			conf.setEnddate(DateUtils.addDateTime(DateUtils.getstrTimestamp(today,"yyyy-MM-dd"),"D",SubscibeConstants.END_DAY-1));

			businSubscribeMapper.saveCorSubscribeConf(conf);
		}
		return true;
	}


}
