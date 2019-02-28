
package com.hc360.common.constants;

/**
 * 用户订阅常量
 * @author weiwei
 * @version 4.0 
 * @date Apr 13, 2007
 */
public class SubscibeConstants {
	/** 用户订阅-删除状态:1 */
	public static final String SUBSCIBE_DEL_STATE="1";
	
	/** 用户订阅-正常状态:0 */
	public static final String SUBSCIBE_NORMAL_STATE="0";
	
	/** 用户订阅-待审状态:0 */
	public static final String SUBSCIBE_UNCHECKED="0";
	
	/** 用户订阅-已审状态:1 */
	public static final String SUBSCIBE_CHECKED="1";
	
	/** 用户订阅-拒审状态:2 */
	public static final String SUBSCIBE_REFUSED="2";
	
	/** 用户订阅-订阅限制:不过滤重发信息:0 */
	public static final int SUBSCIBE_REPEAT=0;
	
	/** 用户订阅-订阅限制:滤重发信息:1 */
	public static final int SUBSCIBE_UNREPEAT=1;
	
	/** 用户订阅-预订状态-未预订:0*/
	public static final String SUBSCIBE_ODERTYPE_UNORDER="0";
	
	/** 用户订阅-预订状态-未申请:1*/
	public static final String SUBSCIBE_ODERTYPE_UNAPPLY="1";
	
	/** 用户订阅-预订状态-已申请:2*/
	public static final String SUBSCIBE_ODERTYPE_APPLY="2";
	
	/** 用户订阅-预订状态-拒绝申请:3*/
	public static final String SUBSCIBE_ODERTYPE_APPLY_REJECTED="3";
	
	/** 用户订阅-预订状态-过期未预订:4*/
	public static final String SUBSCIBE_ODERTYPE_NOAPPLY_IN_VALID="4";
	
	/** 订阅邮件信息-正常状态:0 */
	public static final String SUBSCIBE_MAILINFO_STATES="0";
	
	/** 在线商机快递中数据来源的xml文件的地址 *//*
	public static final String CHANCE_PASS_XML_URL = "http://s.hc360.com/cgi-bin/regmail.cgi";
	
	*//** 在线商机快递中获取匹配的企业的xml文件的地址 *//*
	public static final String CHANCE_PASS_COMPANY_XML_URL = "http://s.hc360.com/cgi-bin/mmtgetlast.cgi";
	
	*//** 在线商机快递中获取匹配的企业的数量xml文件的地址 *//*
	public static final String CHANCE_PASS_COMPANY_COUNT_XML_URL = "http://s.hc360.com/cgi-bin/getcount";*/
		
	/** 退订、订阅到期用户查询类型 */
	public static final int NOTSENTTYPEALL = 0;
	
	/** 判断用户是否退订查询类型 */
	public static final int NOTSENTTYPECANCEL = 1;
	
	/** 判断用户是否到期查询类型 */
	public static final int NOTSENTTYPEEND = 2;
	
	
	/**在线商机速递*/
	public static final String ZXSJKD = "在线商机快递";
	
	/** 非付费会员最多可以订阅关键字个数 :6*/
	public static final int NOT_CHARGE_MEMBER_KEYWORD = 6;
	
	/** 付费会员最多可以订阅关键字个数 :12*/
	public static final int CHARGE_MEMBER_KEYWORD = 12;
	
	/** 会员行业信息订阅最大数量  :5*/
	public static final int CHARGE_MEMBER_TRADE = 10;
	
	/** 免费会员行业信息订阅最大数量  :5*/
	public static final int CHARGE_FREE_MEMBER_TRADE = 5;
	
	/** 会员行业信息订阅最大数量  :5*/
	public static final int CHARGE_MEMBER_CLASS = 5;
	
	
	/** 分类订阅 :0*/
	public static final int SUB_CLASS_SUBTYPE = 0; 
	
	/** 关键字订阅 :1*/
	public static final int SUB_KEYWORD_SUBTYPE = 1;
	
	/** 没有填写关键字的分类订阅*/
	public static final int SUB_SUPERCATID_SUBTYPE = 4;
	
	/** 行业简报订阅 :2*/
	public static final int SUB_TRADE_SUBTYPE = 2; 
	
	/**  求购代码 :1*/
	public static final String BUY_CODE = "1";

	public static final String SUPPLY_MESSAGE = "供应信息";

	public static final String BUY_MESSAGE = "求购信息";
	
	/** 查询全部1级分类id的值:000*/
	public static final String ALL_L3SUPCAT_ID="000";
	
	/** 查询全部1级分类名称的值:所有分类*/
	public static final String ALL_L3SUPCAT_NAME="所有分类";
	
	/** 1级分类名称间的分隔符 */
	public static final String L3SUPCAT_SPLIT="<br>&nbsp;";
	
	
	/**  xml文件访问地址中的文件名 */
	public static final String XML_FILE_NAME= "regmail.cgi";

	/**  普通搜索访问地址中的文件名 */
	public static final String SEARCH_FILE_NAME= "ls";

	/**  关键词代码 w */
	public static final String KEYWORD_CODE = "w";

	/**  栏目[选项]代码 c */
	public static final String OPTION_CODE = "c";
	
	/**  按日期排序代码 v */
	public static final String DATA_ORDER_CODE = "v";

	/**  按标题查找代码 m */
	public static final String TITLE_FIND_CODE = "m";
	
	/** 按分类查找 s */
	public static final String CLASS_FIND_CODE = "s";
	
	/** 按地区查找 z */
	public static final String REGION_FIND_CODE = "z";

	/**  按当日查找代码 d */
	public static final String TODAY_FIND_CODE = "d";
	
	/**  查找数据的数量 e */
	public static final String FIND_COUNT = "e";
	
	/** 获取信息数量时，返回数组名称的前缀 */
	public static final String WORD_COUNT_PREFIX="wordCount";
	
	/** 搜索查询接口返回的企业的名称的key值: corname */
	public static final String SEARCH_RESULT_CORNAME_KEY="corname";
	
	/** 搜索查询接口返回的企业的简介的key值: corname */
	public static final String SEARCH_RESULT_CORINTRODUCTION_KEY="introduction";

	/** 搜索查询接口返回的企业的买卖通指数的key值: mmtidx */
	public static final String SEARCH_RESULT_CORMMTIDX_KEY="mmtidx";
	
	/** 搜索查询接口返回的企业的IM用户名的key值: mmtidx */
	public static final String SEARCH_RESULT_CORIM_KEY="im";
	
	/** 搜索查询接口返回的企业的IM用户名的key值: providerid */
	public static final String SEARCH_RESULT_CORPROVIDERID_KEY="providerid";

	/** 搜索查询接口返回的企业的所在地区的key值: zone */
	public static final String SEARCH_RESULT_CORZONE_KEY="zone";
	
	/** 搜索查询接口返回的企业的所在类型的key值: mode */
	public static final String SEARCH_RESULT_CORMODE_KEY="mode";
	
	/** 搜索查询接口返回的企业的会员等级的key值: type */
	public static final String SEARCH_RESULT_CORTYPE_KEY="type";
	
	/**  供应代码 */
	public static final String SUPPLY_CODE = "0";
	
	/** v=6表示按照日前最新的排序 */
	public static final String DATE_ORDER_VALUE = "6";
	
	/** m=2 表示按标题查找 */
	public static final String TITLE_FIND_VALUE = "2";
	
	/** d=1 表示显示的是当天的数据 */
	public static final String TODAY_FIND_VALUE= "1";
	
	/** 用户订阅邮件-未激活状态:0 */
	public static final String SUBSCRIBE_MAIL_UNACTIVE="0";
	
	/** 默认数据修改者:会员修改 */
	public static final String MODIFY_MAN_DEAULT="会员修改";
	
	/** 默认数据删除者:会员删除 */
	public static final String DEL_MAN_DEAULT="会员删除";
	
	/** 行业用户名转换 packing=pack */
	public static final String AREA_USERNAME_PACKING="pack";
	
	/** 行业用户名转换 ec=elec */
	public static final String AREA_USERNAME_EC="elec";
	
	/** 行业用户名转换 hotelsupplies=hotel */
	public static final String AREA_USERNAME_HOTEL_SUPPLISE="hotel";
	
	/** 行业用户名转换 auto-p=qipei */
	public static final String AREA_USERNAME_AUTO_P="qipei";
	
	/** 行业用户名转换 security=secu */
	public static final String AREA_USERNAME_SECURITY="secu";
	
	/** 行业用户名转换 home=jj */
	public static final String AREA_USERNAME_HOME="jj";
	
	/** 行业用户名转换 home-a=homea */
	public static final String AREA_USERNAME_HOME_A="homea";
	
	
	/** 用户订阅列表分页参数-每页显示数据条目数:2*/
	public static final int SUBSCIBE_LIST_PAGE_SIZE=2;
	
	/** 用户订阅的模块名称 */
	public static final String SUBSCIBE_MOD_NAME="用户订阅";
	
	/** 删除关键字订阅信息 */
	public static final String SUBSCIBE_OP_DEL_KEYWORD="删除关键字订阅信息";
	
	/** 删除行业简报订阅信息 */
	public static final String SUBSCIBE_OP_DEL_TRADE="删除行业简报订阅信息";
	
	/** 删除分类订阅信息 */
	public static final String SUBSCIBE_OP_DEL_CLASS="删除分类订阅信息";
	
	/** 添加关键字订阅信息 */
	public static final String SUBSCIBE_OP_ADD_KEYWORD="添加关键字订阅信息";
	
	/** 添加关键字订阅信息 */
	public static final String SUBSCIBE_OP_ADD_KEYWORD_BY_REG="用户补充注册，添加关键字订阅信息";
	
	/** 添加关键字订阅信息 */
	public static final String SUBSCIBE_OP_ADD_TRADE="添加行业简报订阅信息";
	
	/** 添加关键字订阅信息 */
	public static final String SUBSCIBE_OP_ADD_CLASS="添加分类订阅信息";
	
	/**更新订阅信息操作描述 */
	public static final String SUBSCIBE_OP_UPDATE_KEYWORD="更新关键字订阅信息";
	
	/**更新订阅信息操作描述 */
	public static final String SUBSCIBE_OP_UPDATE_TRADE="更新行业简报订阅信息";
	
	/**更新订阅信息操作描述 */
	public static final String SUBSCIBE_OP_UPDATE_CLASS="更新行业简报订阅信息";
	
/**	 匿名订阅邮箱激活确认 系统通知ID 123 */
	public static final long SYSINFO_FREE_SUBSCRIBE_ID = 123;
	/**	 匿名订阅邮箱退订 系统通知ID 124 */
	public static final long SYSINFO_FREE_UNSUBSCRIBE_ID = 124;

	public static final long MAIL_SUBCONFIRM_ID = 115;
	/**	 匿名订阅邮箱订阅成功 邮件模版编号 116 */
	public static final long MAIL_SUBSUCCESS_ID = 116;
	
	/** 匿名订阅行业简报 邮件模版编号127 */
	public static final long SYSINFO_AREA_FREE_SUB_ID = 127;
	/** 匿名退订行业简报 邮件模版编号128 */
	public static final long SYSINFO_AREA_FREE_UNSUB_ID = 128;

	/** 邮件未读到期周期 */
	public static final int END_DAY = 60;
	
	/** 邮件未激活,邮件订阅已退订 0 */
	public static final String EMAIL_INACTIVATED = "0";

	/** 邮件已激活 1 */
	public static final String EMAIL_ACTIVATED = "1";

	/** 匿名邮件已退订 2 */
	public static final String EMAIL_UNSUBSCRIBED = "2";

	/** 默认订阅信息－供应 */
	public static final String DEFAULT_INFOTYPE = "0";
	
	/** 邮件已发送 1*/
	public static final int EMAIL_SEND = 1;

	/** 邮件未发送 0*/
	public static final int EMAIL_UNSEND = 0;
	
	/** 匿名关键词订阅 1*/
	public static final int  SUBSCIBE_FREEE_INFO= 1;
	
	/** 匿名行业订阅 2*/
	public static final int  SUBSCIBE_FREEE_TRADE= 2;
	
	
	/** 匿名邮件订阅 1*/
	public static final String SUBSCIBE_FREE_SUB_STATE="1";
	
	/** 匿名邮件退阅 2*/
	public static final String SUBSCIBE_FREE_UNSUB_STATE="2";
	
	/** 所有供求类型*/
	public static final String[]  ALL_INFOTYPE = new String[]{"0,1","1","0"};
	/** 所有供应类型*/
	public static final String[]  ALL_SUPPLY = new String[]{"0","0,1"};
	/** 所有求购类型*/
	public static final String[] ALL_REQUEST = new String[]{"1","0,1"};

	/** 订阅邮件提醒默认天数*/
	public static final long MAIL_FREQUENCY = 1;
	/** 订阅邮件提醒默认发送状态*/
	public static final long MAIL_ISSEND = 0;
	/** 订阅邮件默认发送判断*/
	public static final long MAIL_ISMAIL = 1;
}
