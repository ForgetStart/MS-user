package com.hc360.common;

/*
 * @(#) AppConstants.java 4.0 2007-4-11
 * Copyright(c) 2000-2007 HC360.COM, All Rights Reserved.
 */


public class AppConstants {
	
	public static final String CHARTSET_DEFAULT = "GBK";

	public static final String CHARTSET_GBK = "GBK";

	public static final String CHARTSET_ISO = "ISO-8859-1";

	public static final String CHARTSET_UTF8 = "UTF-8";

	public static final String CHARTSET_GB2312 = "GB2312";

	/**商机审核状态uncheck-含有违禁广告*/
	public static final String BUSIN_UNCHECK_FORBID = "3";

	/**商机审核状态uncheck-免审*/
	public static final String BUSIN_UNCHECK_PASS = "1";

	/**商机审核状态uncheck-拒审*/
	public static final String BUSIN_UNCHECK_REFUSE = "2";

	/**商机审核状态uncheck-待审*/
	public static final String BUSIN_UNCHECK_CHECK = "0";

	/**搜索接口定义*/
	//查询分类 新服务
	public static final String SEARCH_SUPERCAT_URL_NEW="http://s.hc360.com/cgi-bin/portal_relaword.cgi";
	//查询分类
	public static final String SEARCH_SUPERCAT_URL="http://s.hc360.com/match";

	/** 是网站禁止内容 */
	public static final int MMT_FORBIDDEN_CONTENT = 1;
	/** 非网站禁止内容 */
	public static final int MMT_PERMISSION_CONTENT = 0;

	/**屏蔽词调用detail的url地址*/
	public static final String ALLOW_SCREENKEYWORD_DETAIL = "http://detail.b2b.hc360.com/detail/turbine/action/ajax.WhiteListAjaxAction?";

	/** 商机操作白名单标识 */
	public static final long OPERATE_WHITE_LIST_BUSIN=0l;

	public static enum SysName {
		my,
		manage,
		detail,
		myscheduler,
		sitemove,
		sitemove3y,
		pushtool,
		tradedata,
		memcachmanage,
		mobile;

		private SysName() {
		}
	}
	
	
    //Redis键
    public static final String MMT_TRADE_IDENTITY =  "mmt:trade:identity";
    //不支持在线交易行业键
    public static final String MMT_TRADE_IDENTITY_AREAIDS = MMT_TRADE_IDENTITY+ ":areaids";
    //不支持在线交易分类键
    public static final String MMT_TRADE_IDENTITY_SUPCATIDS = MMT_TRADE_IDENTITY+ ":supcatids";
    //允许特殊经营的设置信息键
    public static final String MMT_TRADE_IDENTITY_LICENSE_CATEGORY = MMT_TRADE_IDENTITY+ ":license_category";
    //允许特殊经营的分类键
    public static final String MMT_TRADE_IDENTITY_LICENSE_SUPCATID_LICATIDS = MMT_TRADE_IDENTITY+ ":license_supcatid_licatids";
    //认证授权信息键
    public static final String MMT_TRADE_IDENTITY_LICENSE_PROVIDERID_LICATID = MMT_TRADE_IDENTITY+ ":license_providerid_licatid";
    //不存在
    public static final String MMT_TRADE_NOEXIST="0";
    //存在
    public static final String MMT_TRADE_EXIST="1";
    //缓存过期
    public static final String MMT_TRADE_EXPIRE="2";
    
    
    /**普通会员*/
	public static final long MMT_MEMBER_PT = 0;
	/**买卖通会员*/
	public static final long MMT_MEMBER_MMT = 4;
	/**VIP会员*/
	public static final long MMT_MEMBER_VIP = 5;
	/**银牌会员*/
	public static final long MMT_MEMBER_SILLER = 6;
	/**金牌会员*/
	public static final long MMT_MEMBER_GOLD = 7;
	/**白金会员*/
	public static final long MMT_MEMBER_PLATINA = 8;

	//警告过滤词键
	public static final String WARN = "warn";
	public static final String WARN_WORDS = "words";
	public static final String WARN_DASH = "dash";
	public static final String WARN_SYMBOLS = "symbols";
	public static final String WARN_PHONE400 = "phone_400";
	public static final String WARN_MOBILENUM = "mobilenum";
	public static final String WARN_MOBILENUM4= "mobilenum4";
	public static final String WARN_UNICOMNUM = "unicomnum";
	public static final String WARN_UNICOMNUM4 = "unicomnum4";
	public static final String WARN_TELECOMNUM = "telecomnum";
	public static final String WARN_TELECOMNUM4 = "telecomnum4";
	//广告禁用词键
	public static final String ADVERTISING_LAW_FORBIDDEN = "advertisingLawForbidden";
	public static final String ADVERTISING_LAW_FORBIDDEN_WORDS = "words";

	public static final String MMT_EXPIRE_1MONTH_AFTER = "3";//买卖通到期后一个月后

	public static final int MAXNUM_BUSINSERIES = 100;//用户商铺目录最大数

	/**商机发布—其它其它分类—采购*/
	public static final String SUPCATID_BUY_OTHER="035001";

	//多线程处理消息，线程个数
	public static final int nThreads = 30;
	/**操作类型 新增*/
	public static final int OPTYPE_ADD=0;
	/**操作类型 修改*/
	public static final int OPTYPE_EDIT=1;
	/**操作类型 删除*/
	public static final int OPTYPE_DELETE=2;
	/**操作类型 重发*/
	public static final int OPTYPE_REPEAT=3;
	/**操作类型 升级*/
	public static final int OPTYPE_UPGRADE=4;
	/**操作类型 降级*/
	public static final int OPTYPE_DEGRADE=5;
	/**操作类型 审核*/
	public static final int OPTYPE_AUTHEN=6;
	/**操作类型 拒审*/
	public static final int OPTYPE_REFUSE=7;
	/**操作类型 撤回*/
	public static final int OPTYPE_DROP=8;
	
}