
package com.hc360.common.constants;


/**
 * 
 * 商机常量
 * @author weiwei
 * @version 4.0 May 3, 2007
 * @since 4.0
 * @since 4.0
 */
public class BusinConstants {
	/** 商机发布-标示参数名称 */
	public static final String SAVE_BUSIN_PARA_NAME="saveTag223";
	/** 商机发布-标示参数值 */
	public static final String SAVE_BUSIN_PARA_VALUE="saveTagValue223";
	
	/**时间显示*/
	public static final int BUSINDAY=5;
	
	public static final String BUSIN_SAME_UNCHECK="您已发布过该商机，目前正处于审核中，请您耐心等待！";
	
	public static final String BUSIN_SAME_REFUSED="您之前发布过相同商机，但未审核通过，建议您修改后重新提交审核！";
	
	public static final String BUSIN_SAME_OVERDUE="您之前发布过相同商机，目前已过期，建议您使用商机重发功能！";
	
	public static final String BUSIN_SAME_ONLINE="您已发布过该商机，请勿再次发布，建议您使用商机重发功能！";
	
	public static final String BUSIN_SAME_ONLINE_SUB="很抱歉，此采购信息与定制速购采购信息重复，请重新填写。";
	
	public static final String BUSIN_SAME_ONLINE_APP="很抱歉，此采购信息与指定私密采购信息重复，请重新填写。";
	
	public static final String BUSIN_SAME_USER_REFUSE="对不起，您的公司资料未通过审核，请先修改，待审核通过后，再发布供求信息。";
	
	public static final String BUSIN_SAME_SERIES_ERR="对不起，每个目录最多只能包含100条供应商机，你选择的目录已经包含了100条供应商机，请重新选择。";
	
	public static final String STATES_ADD = "0"; //新增
	public static final String STATES_DEL = "1"; //删除
	/***商机状态-有效**/
	public static final String BUSIN_STATES_EFFE = "0";
	/**收费会员商机发布上限*/
	public static final int BUSIN_FEE_MAXNUM=100000;//收费会员商机发布上限100000
	public static final int BUSIN_FREE_MAXNUM=50000;//免费会员商机发布上限50000
	public static final int BUSIN_BUY_MAXNUM=1000;//采购商机发布上限1000
	public static final int BIDDING_BUY_MAXNUM=20;//招标发布上线 20条
	
	
	public static final String ETC_AREA = "018";//电子行业代码
	/**电子行业收费会员商机发布上限*/
	public static final int ETC_BUSIN_FEE_MAXNUM=5000000;//电子行业收费会员商机发布上限5000000
	public static final int ETC_BUSIN_SUPCAT_MAXNUM=100000;//电子行业同一终极分类商机发布上限100000
	
	public static final int LIMI_BUSIN_FEE_MAXNUM=100000;//被限制行业或被账号的收费会员商机发布上限100000
	public static final int BUSIN_SUPCAT_MAXNUM=10000;//所有行业同一终极分类商机发布上限10000
	
	
	//public static final String SNS_URL = "http://shehui.hc360.com/notify_business.php";//SNS数据接口\
		
	/**操作商机说明 **/
	public static final String BUSIN_OPERATE_DESC_SELLER="打折特卖会给商机价格打折";
	
	public static final String BUSIN_SUPPORT_ONLINE_TRANSACTION="支持在线交易";
	
	/**操作友情链接说明 **/
	public static final String HOT_LINK_ADD="添加友情链接";
	/**
	 * 操作商机的用户
	 */
	public static final String BUSIN_OPERATER_SELLER="SellerMeetting";
	
	/** 商机参数属性 - 终极分类参数 */
	public static final int BUSIN_ATT_TYPE_CAT=0;
	
	/** 商机参数属性 - 1级分类参数 */
	public static final int BUSIN_ATT_TYPE_SUPCAT=1;
	
	/** 商机参数属性 - 行业参数 */
	public static final int BUSIN_ATT_TYPE_AREA=2;
	
	
	/** 商机参数属性 - 必填参数 */
	public static final String BUSIN_ATT_YDIRECT="1";
	
	/** 商机参数属性 - 非必填参数 */
	public static final String BUSIN_ATT_NDIRECT="0";
	
	public static final int  BUSIN_TYPE_SUPPLY = 0;//供应
	public static final int  BUSIN_TYPE_BUY = 1;//采购
	public static final int  BUSIN_TYPE_BID = 2;//招标
	
	public static final int BUSIN_ADD_LOGFUNCTION__FID=866;
	
	public static final int BUSIN_UPDATE_LOGFUNCTION_FID=867;

	public static final int BUSIN_COPY_LOGFUNCTION_FID=868;
	
	
	public static final String BUSIN_SUPPLY_SORTTAG = "0";//供应标识
	public static final String BUSIN_BUY_SORTTAG = "1";//采购标识
	
	/** 商机类型 - 0 普通商机 */
	public static final String BUSIN_SOURCE_COMMEN="0";
	
	/** 商机类型 - 1 一键快速发布 */
	public static final String BUSIN_SOURCE_KEY="1";
	
	/** 商机类型 - 2 定制速配采购 */
	public static final String BUSIN_SOURCE_SUB="2";
	
	/** 商机类型 - 3 速购定制 */
	public static final String BUSIN_SOURCE_SUBTYPE="3";
	
	/** 商机类型 - 4 指定私密采购 */
	public static final String BUSIN_SOURCE_APPPROVIDER="4";
	
	/** 商机类型 - 5 供应转商机 */
	public static final String BUSIN_SOURCE_SUPPY_TO_BUY="5";
	
	/** 商机类型 - 6 发发供应转商机 */
	public static final String BUSIN_SOURCE_IM_TO_BUY="6";
	
	/** 商机类型 - 2 销售中商机 */
	public static final String BUSIN_SOURCE_ON_SALE="businonsale";
	
	/** 商机类型 - 2 未上架商机  */
	public static final String BUSIN_SOURCE_NOT_SALE="businnotonsale";
	
	/**上网状态-定制采购*/
	public static final String BUSIN_ONLINE_STATE_SUB="3";
	
	/**上网状态-指定采购*/
	public static final String BUSIN_ONLINE_STATE_APP="4";
	
	/**商机拒审类型-FLASH*/
	public static final int BUSIN_REFUSE_TYPE_FLASH = 0;
	
	/**商机审核状态-审核通过*/
	public static final int BUSIN_CHECSTATE_PASS = 1;
	
	/**商机审核状态-待审*/
	public static final String BUSIN_CHECK_UNCKECK = "0";
	
	/**商机审核状态-审核通过*/
	public static final String BUSIN_CHECK_PASS = "1";
	
	/**商机审核状态-拒审*/
	public static final String BUSIN_CHECK_REFUSE = "2";
	
	/**商机审核状态uncheck-含有违禁广告*/
	public static final String BUSIN_UNCHECK_FORBID = "3";
	
	/**商机审核状态uncheck-免审*/
	public static final String BUSIN_UNCHECK_PASS = "1";
	
	/**商机审核状态uncheck-拒审*/
	public static final String BUSIN_UNCHECK_REFUSE = "2";
	
	/**商机审核状态uncheck-待审*/
	public static final String BUSIN_UNCHECK_CHECK = "0";
	
	/**商机有效状态-正常*/
	public static final String BUSIN_STATES = "0";
	
	/**商机有效状态-删除*/
	public static final String BUSIN_STATES_DEL = "1";
	
	/**商机推送状态-待推送*/
	public static final String BUSIN_STATES_OPERSTATE = "0";
	
	/**商机搜索推送状态-待推送*/
	public static final String BUSIN_STATES_SEARCHSTATE = "0";
	
	/**商机订阅状态-未订阅*/
	public static final String BUSIN_ISMAIL_UNORDER="0";
	
	/**商机订阅状态-已订阅*/
	public static final String BUSIN_ISMAIL_ORDER="1";
	
	/**商机发布途径-人工代发*/
	public static final String BUSIN_PUBTYPE_RGDF="2";
	
	/**商机上网状态-已上网*/
	public static final String BUSIN_ONLINE_STATE="1";
	
	/**商机上网状态-*/
	public static final int BUSIN_UNONLINE_STATE=2;
	
	
	/**通过用户类别判断是否支持在线交易方法返回的三种类型*/
	//MMT免费会员
	public static final String USER_TRADE_TYPE_MMT_FREE = "mmt_free";
	//MMT收费会员
	public static final String USER_TRADE_TYPE_MMT_MEMBER = "mmt_member";
	
	/**在线交易字段后提示信息标识*/
	//不支持  原因：买卖通免费会员
	public static final String SUPPORT_TRADE_INFO_TAG_USER_MMT_FREE = "mmt_free";
	//不支持 原因：行业不支持
	public static final String SUPPORT_TRADE_INFO_TAG_USER_AREA_NOT_SUPPORT= "sys_area_not_support";
	//不支持  原因：慧付宝未激活
	public static final String SUPPORT_TRADE_INFO_TAG_USER_MMT_MEMBER_HFB_NOT_VALID = "hfb_not_valid";
	//不支持  原因：慧付宝审核中
	public static final String SUPPORT_TRADE_INFO_TAG_USER_MMT_MEMBER_HFB_STATE_AUDITING = "hfb_state_auditing";
	//不支持  原因：慧付宝审核未通过
	public static final String SUPPORT_TRADE_INFO_TAG_USER_MMT_MEMBER_HFB_STATE_REFUSE = "hfb_state_refuse";
	//不支持  原因：超市分类不支持(包含1.授权前后均不支持  以及  2.虽存在不支持在线交易分类中但不存在于特许经营许可分类中)
	public static final String SUPPORT_TRADE_INFO_TAG_SUPERCAT_NOT_SUPPORT = "supercat_not_support";
	//不支持  提示 : 超市分类授权前不支持但授权后支持在线交易
	public static final String SUPPORT_TRADE_INFO_TAG_SUPERCAT_BEFORE_SUPPORT = "supercat_before_support";
	//支持
	public static final String SUPPORT_TRADE_INFO_TAG_YES = "yes";
	
	
	
	/**是否支持在线交易*/     
	public static final String IS_SUPPORT_TRADE_NO = "0";//不支持
	public static final String IS_SUPPORT_TRADE_YES = "1";//支持
	
	/**运费承担类型*/
	public static final String TRANS_FARE_BY_SELLER = "0";//卖家承担
	public static final String TRANS_FARE_BY_BUYER = "1";//买家承担
	
	/**产品查询参数常量-是否支持在线交易*/
	public static final String QUERY_PARAM_IS_SUPPORT_TRADE = "-1";
	public static final String QUERY_PARAM_IS_SUPPORT_TRADE_NO = "0";
	public static final String QUERY_PARAM_IS_SUPPORT_TRADE_YES = "1";
	
	/**
	 * 是否支持在线交易
	 */
	//否
	public static final String BUSIN_IS_SUPPORT_TRADE_NO = "0" ;
	//是
	public static final String BUSIN_IS_SUPPORT_TRADE_YES = "1" ;
	
	/**销售中产品查询条件框中的提示信息*/
	public static final String QUERY_PARAM_INFO_QUERY_TITLE = "请输入产品标题...";
	public static final String QUERY_PARAM_INFO_MIN_PRICE = "最低价格";
	public static final String QUERY_PARAM_INFO_MAX_PRICE = "最高价格";
	public static final String QUERY_PARAM_INFO_COMPANY_NAME = "输入公司名称";
	public static final String QUERY_PARAM_INFO_CONTACTER = "联系人";
	
	/**页面传过来的排序字段和排序值*/
	//发布日期 降序
	public static final String QUERY_ORDER_TYPE_PUBDATE_DESC = "pubdate_desc";
	//发布日期 升序
	public static final String QUERY_ORDER_TYPE_PUBDATE_ASC = "pubdate_asc";
	//到期日期降序
	public static final String QUERY_ORDER_TYPE_ENDDATE_DESC = "enddate_desc";
	//到期日期升序
	public static final String QUERY_ORDER_TYPE_ENDDATE_ASC = "enddate_asc";
	//商机星级降序
	public static final String QUERY_ORDER_TYPE_BUSINESSSTAR_DESC = "businessStar_desc";
	//商机星级升序
	public static final String QUERY_ORDER_TYPE_BUSINESSSTAR_ASC = "businessStar_asc";
	
	
	/**未上架产品三个标签页的type参数*/
	//已过期
	public static final String BUSIN_NOT_ON_SALE_TAB_OVERDUE = "overdue";
	//审核中
	public static final String BUSIN_NOT_ON_SALE_TAB_VERIFING = "verifing";
	//审核未通过
	public static final String BUSIN_NOT_ON_SALE_TAB_REFUSED = "refused";
	
	/**获取商机数量  类别*/
	//销售中
	public static final String BUSIN_COUNT_NUM_KEY_ONLINE = "onlinetotalbusin";
	//审核中
	public static final String BUSIN_COUNT_NUM_KEY_VERIFING = "auditingtotalbusin";
	//审核未通过
	public static final String BUSIN_COUNT_NUM_KEY_REFUSED = "noauditingtotalbusin";
	//已过期
	public static final String BUSIN_COUNT_NUM_KEY_OVERDUE = "outtimebusin";
	
	/**商机一键重发   商机类型*/
	//销售中
	public static final int ONE_KEY_REPEATE_INFO_BUSIN_TYPE_ON_SALE = 1;
	//已过期
	public static final int ONE_KEY_REPEATE_INFO_BUSIN_TYPE_OVERDUE = 2;
	
		
	/**医疗器械行业编号*/
	public static final String BUSIN_AREA_CODE_MEDICAL="017";
	
	/**医药行业编号*/
	public static final String BUSIN_AREA_CODE_MEDICINE="028";
	
	/**
	 * 保存商机调用来源 add by zhaorui
	 */
	//商机新增
	public static final int BUSIN_SAVE_FROM_BUSIN_ADD = 0;
	//商机修改
	public static final int BUSIN_SAVE_FROM_BUSIN_EDIT = 1;
	//快速发供应
	public static final int BUSIN_SAVE_FROM_FAST_BUSIN_ADD = 3;
	//注册发商机
	public static final int BUSIN_SAVE_FROM_BUSIN_REGSAVE = 4;
	//商机列表页修改标题
	public static final int BUSIN_SAVE_FROM_SAVE_TITLE = 5;
	//商机列表页修改价格
	public static final int BUSIN_SAVE_FROM_SAVE_PRICE = 6;
	
	/** 是否需要卖家确认 商机列表查询参数值*/
	public static final String BUSIN_PARAM_SELLER_CONFIRM_YES = "yes";
	public static final String BUSIN_PARAM_SELLER_CONFIRM_NO = "no";
	/** 是否需要卖家确认*/
	public static final String SELLER_CONFIRM_YES = "1";
	public static final String SELLER_CONFIRM_NO = "0";
	
	
	/** 是否需要卖家确认 数据是否有有效 */
	public static final String BUSIN_CHANCE_TRADE_STATES_VALID = "0";
	public static final String BUSIN_CHANCE_TRADE_STATES_DISVALID = "1";
	
	/** 商机承诺设置 */
	public static final String BUSIN_BOND_TYPE_FIFTEEN_CHANGE = "1";
	
}
