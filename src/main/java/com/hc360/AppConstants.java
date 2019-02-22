package com.hc360;

public class AppConstants {

	public static final String IMAGE_NO_NEW = "https://b2b.hc360.com/mmtTrade/images/nopic.jpg";
	/** 系统标识 */
	public static final String SYS_ID = "detail";

	/** 企业信息缓存key的前缀 */
	public static final String MS_DETAIL_COMPANY_PREFIXKEY = "ms:company:relate:";

	/** 商机信息缓存key的前缀 */
	public static final String MS_DETAIL_BUSINESS_PREFIXKEY = "ms:business:relate:";

	/** 商机信息缓存key的前缀 */
	public static final String MS_DETAIL_MO_PREFIXKEY = "ms:memcached:";

	/** 企业更新时间Key的前缀 */
	public static final String MS_COMPANY_UPDATE_PREFIXKEY = "ms:OnCorTableMO:updatetime:";

	/** 商铺3.0模板修改时间KEY的前缀 */
	public static final String MS_SHOP_UPDATE_PREFIXKEY = "ms:shop2016:updatetime:";

	/** 商铺访客状态（当前是一个月内是否访问） */
	public static final String DETAIL_VISITOR_STATE = "detail:visitor:state:";

	/** 商铺版本，作用是在有发版的时候重置所有的缓存 */
	public static final String DETAIL_VERSION = "detail:version:";

	/** 商营通KEY */
	public static final String MY_SHANG_YING_TONG = "my:communication:indexurl:";

	/** 商铺通用企业信息（含联系信息、风格设置及状态位等 */
	public static final String COMMON_COMPANY_OBJECT = "commonCompanyObject";
	/** 318购项目当前活动标识 */
	public static final String STOCK_NAME = "stock_name";
	public static final String SIGN_CLASS = "sign_class";
	/** 买卖通档案常量的设置 */
	public static final String MMT_DOC_URL_LINK = "10";
	/**
	 * 图片类型对应值： 0：商机图片 1：产品图片 2：公司图片、CA认证、商铺海报图 3：方案案例图片 4：动态图片 5：人才图片 6：产品手册
	 * 7：公司Logo图片 8：公司展示图片 9：公司整体展示图片 10：证书图片 12：特殊版位 13: 临时图片
	 * 14:全景图或全景预览图或全景exe文件） 15：Banner广告、16：Button广告
	 */
	public static final String IMAGE_TYPE_BUSINCHANCE = "0";

	public static final String IMAGE_TYPE_PRODUCT = "1";

	public static final String IMAGE_TYPE_COMPANY = "2";

	public static final String IMAGE_TYPE_PRODDOC = "6";
	/** 公司资讯CorpInfo常量 */
	public static final String CORP_INFO_GSDT = "公司动态";

	public static final String CORP_INFO_JJFA = "解决方案";

	public static final String CORP_INFO_CGAL = "成功案例";

	public static final String CORP_INFO_NUMTHREE = "3";

	public static final String CORP_INFO_NUMFOUR = "4";

	public static final String CORP_INFO_NUMSIX = "6";

	public static final String CORP_INFO_DYNAMIC = "8";

	public static final String CORP_INFO_FINALPAGE = "36";

	public static final String CORP_INFO_NUMEIGHT = "8";

	public static final String CORP_INFO_BUSINURL = "29";

	public static final String CORP_INFO_BUYURL = "30";

	public static final String CORP_INFO_PROURL = "27";

	public static final String CORP_INFO_CREDIT = "13";

	public static final String CORP_INFO_INDEX = "5";
	/** 供应信息分类sorttag:0为供应信息，1为求购信息 */
	public static final String SORTTAG_SUPPLY = "0";
	/** 低活跃会员QQ */
	public static final String LOW_ACTIVITY_QQ = "3286826833";
	/** 实地认证KEY */
	public static final String ORDER_FIELD_CERTIFICATE = "order:fieldCertificate:";

	/** 商铺会员类型--start */
	/** 普通会员 */
	public static final long MMT_MEMBER_PT = 0;
	/** 买卖通会员 */
	public static final long MMT_MEMBER_MMT = 4;
	/** VIP会员 */
	public static final long MMT_MEMBER_VIP = 5;
	/** 银牌会员 */
	public static final long MMT_MEMBER_SILLER = 6;
	/** 金牌会员 */
	public static final long MMT_MEMBER_GOLD = 7;
	/** 白金会员 */
	public static final long MMT_MEMBER_PLATINA = 8;
	/** 建站会员 */
	public static final long MMT_MEMBER_JZ = 1;
	/** 买卖通体验会员 */
	public static final long MMT_MEMBER_MMT_TRIAL = 50;
	/** 商铺会员类型--end */

	/** 模板状态 ：1 【正在应用】、2 【临时】、3 【私有模板】、4 【历史】 */
	public static final String TEMPLATE_STATE_INUSE = "1";
	public static final String TEMPLATE_STATE_TEMPORARY = "2";
	public static final String TEMPLATE_STATE_PRIVATE = "3";
	public static final String TEMPLATE_STATE_HISTORY = "4";

	/** 模板加载类型：LOADTYPE = 1 初始化 LOADTYPE=2 非初始化 */
	public static final String TEMPLATE_LOADTYPE_INIT = "1";
	public static final String TEMPLATE_LOADTYPE_UNINIT = "2";

	/** 模板下模块所属页面类型 1 首页 2 二级页 */
	public static final String MODULE_PAGETYPE_HOME = "1";
	public static final String MODULE_PAGETYPE_CHANNEL = "2";

	/** 自营买卖通服务类型 */
	public static final String REMOVE_THE_ADS = "1";// 去广告服务

	/** 模块区域标记 */
	public static final String REGION_MARK_SIGN_NAV = "region_sign_navigation";// 招牌导航
	public static final String REGION_MARK_FULL_SCREEN = "region_full_screen";// 宽屏广告
	public static final String REGION_MARK_FULL_WIDESCREEN = "region_full_widescreen";// 宽屏扩展广告区域(包括宽屏自定义模块)
	public static final String REGION_MARK_TOP_BANNER = "region_top_banner";// 顶部通栏区
	public static final String REGION_MARK_CRUMBS = "region_crumbs";// 搜索栏区域
	public static final String REGION_MARK_PERCENT_25 = "region_percent_25";// 25%区域
	public static final String REGION_MARK_PERCENT_75 = "region_percent_75";// 75%区域
	public static final String REGION_MARK_BOTTOM_BANNER = "region_bottom_banner";// 底部通栏
	/** 区域模块标记 */
	public static final String MODULE_MARK_SIGN = "module_sign";// 招牌
	public static final String MODULE_MARK_NAV = "module_navigation";// 导航
	public static final String MODULE_MARK_ADS = "module_ads";// 宽屏广告

	public static final String MODULE_MARK_BANNER_PRODUCTS = "module_banner_products";// 通栏产品
	public static final String MODULE_MARK_BANNER_ADS = "module_banner_ads";// 扩展广告
	public static final String MODULE_MARK_BANNER_WIDESCREEN_ADS = "module_banner_widescreen_ads";// 1920宽屏扩展广告
	public static final String MODULE_MARK_CRUMBS = "module_crumbs";// 搜索栏区域-面包屑
	public static final String MODULE_MARK_COMPANY_INTRO = "module_company_intro";// 公司介绍
	public static final String MODULE_MARK_COMPANY_DYNAMIC = "module_company_dynamic";// 公司动态
	public static final String MODULE_MARK_PROD_WINDOW = "module_prod_window";// 产品橱窗
	public static final String MODULE_MARK_LATEST_SYPPLY = "module_latest_supply";// 最新供应
	public static final String MODULE_MARK_PROD_CLASSIFY = "module_prod_classify";// 产品分类
	public static final String MODULE_MARK_COMPANY_ALBUM = "module_company_album";// 公共相册
	public static final String MODULE_MARK_ALBUM_WINDOW = "module_album_window";// 相册橱窗
	public static final String MODULE_MARK_CONTACT_US = "module_contact_us";// 联系我们
	public static final String MODULE_MARK_FEEDBACK = "module_feedback";// 客户留言
	public static final String MODULE_MARK_CERTIFICATE = "module_certificate";// 信誉证书
	public static final String MODULE_MARK_EXTEND_WINDOW = "module_extend_window";// 扩展橱窗
	public static final String MODULE_MARK_COMPANY_FILES = "module_company_files";// 企业档案
	public static final String MODULE_MARK_PROF_WINDOW = "module_prof_window";// 专业橱窗
	public static final String MODULE_MARK_CUSTOM = "module_custom";// 自定义
	public static final String MODULE_MARK_CUSTOM_VIDEO = "module_custom_video";// 掌柜说视频
	public static final String MODULE_MARK_WIDESCREEN_CUSTOM = "module_widescreen_custom";// 1920宽屏自定义
	public static final String MODULE_MARK_FRIENDSHIP_LINK = "module_friendship_link";// 友情链接
	public static final String MODULE_MMT_ARCHIVES = "module_mmt_archives";// MMT

	/** redis key */
	public static final String MS_DHOMES_REDIS_KEY = "ms:hc360:";
	/** 商铺3.0-前端-redisKEY */
	public static final String DETAIL_SHOP2016_REDIS_KEY = "detail:shop2016:";

	public static final String IMAGE_NO = "https://b2b.hc360.com/mmtTrade/images/nopic.jpg";
	// 独立供应商机终极页地址
	public static final String SUPPLYSELF_DETAIL_URL = "0";

	/** 商铺视频地址信息缓存key的前缀 */
	public static final String MS_SHOP_HCVIDEO_PREFIXKEY = "ms:hc360:video:";
	
	
	/*---2018.10.15修改商铺首页404页面-----*/
	public static final String MS_DHOMES_404 = "Dhomes_404";
	
}
