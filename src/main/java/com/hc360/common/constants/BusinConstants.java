
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
	

	public static final String BUSIN_SUPPLY_SORTTAG = "0";//供应标识
	public static final String BUSIN_BUY_SORTTAG = "1";//采购标识

	public static final String BUSIN_FREEUSER_ONLINEBC_ERR="发布支持在线交易的商机，用户必需进行经营资质备案，否则不予入库!";

	/**商机订阅状态-未订阅*/
	public static final String BUSIN_ISMAIL_UNORDER="0";
	
	/**商机订阅状态-已订阅*/
	public static final String BUSIN_ISMAIL_ORDER="1";
	
	/**在线交易字段后提示信息标识*/
	//不支持  原因：买卖通免费会员
	public static final String SUPPORT_TRADE_INFO_TAG_USER_MMT_FREE = "mmt_free";

	
	




		

}
