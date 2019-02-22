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

	/**�̻����״̬uncheck-����Υ�����*/
	public static final String BUSIN_UNCHECK_FORBID = "3";

	/**�̻����״̬uncheck-����*/
	public static final String BUSIN_UNCHECK_PASS = "1";

	/**�̻����״̬uncheck-����*/
	public static final String BUSIN_UNCHECK_REFUSE = "2";

	/**�̻����״̬uncheck-����*/
	public static final String BUSIN_UNCHECK_CHECK = "0";

	/**�����ӿڶ���*/
	//��ѯ���� �·���
	public static final String SEARCH_SUPERCAT_URL_NEW="http://s.hc360.com/cgi-bin/portal_relaword.cgi";
	//��ѯ����
	public static final String SEARCH_SUPERCAT_URL="http://s.hc360.com/match";

	/** ����վ��ֹ���� */
	public static final int MMT_FORBIDDEN_CONTENT = 1;
	/** ����վ��ֹ���� */
	public static final int MMT_PERMISSION_CONTENT = 0;

	/**���δʵ���detail��url��ַ*/
	public static final String ALLOW_SCREENKEYWORD_DETAIL = "http://detail.b2b.hc360.com/detail/turbine/action/ajax.WhiteListAjaxAction?";

	/** �̻�������������ʶ */
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
	
	
    //Redis��
    public static final String MMT_TRADE_IDENTITY =  "mmt:trade:identity";
    //��֧�����߽�����ҵ��
    public static final String MMT_TRADE_IDENTITY_AREAIDS = MMT_TRADE_IDENTITY+ ":areaids";
    //��֧�����߽��׷����
    public static final String MMT_TRADE_IDENTITY_SUPCATIDS = MMT_TRADE_IDENTITY+ ":supcatids";
    //�������⾭Ӫ��������Ϣ��
    public static final String MMT_TRADE_IDENTITY_LICENSE_CATEGORY = MMT_TRADE_IDENTITY+ ":license_category";
    //�������⾭Ӫ�ķ����
    public static final String MMT_TRADE_IDENTITY_LICENSE_SUPCATID_LICATIDS = MMT_TRADE_IDENTITY+ ":license_supcatid_licatids";
    //��֤��Ȩ��Ϣ��
    public static final String MMT_TRADE_IDENTITY_LICENSE_PROVIDERID_LICATID = MMT_TRADE_IDENTITY+ ":license_providerid_licatid";
    //������
    public static final String MMT_TRADE_NOEXIST="0";
    //����
    public static final String MMT_TRADE_EXIST="1";
    //�������
    public static final String MMT_TRADE_EXPIRE="2";
    
    
    /**��ͨ��Ա*/
	public static final long MMT_MEMBER_PT = 0;
	/**����ͨ��Ա*/
	public static final long MMT_MEMBER_MMT = 4;
	/**VIP��Ա*/
	public static final long MMT_MEMBER_VIP = 5;
	/**���ƻ�Ա*/
	public static final long MMT_MEMBER_SILLER = 6;
	/**���ƻ�Ա*/
	public static final long MMT_MEMBER_GOLD = 7;
	/**�׽��Ա*/
	public static final long MMT_MEMBER_PLATINA = 8;

	//������˴ʼ�
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
	//�����ôʼ�
	public static final String ADVERTISING_LAW_FORBIDDEN = "advertisingLawForbidden";
	public static final String ADVERTISING_LAW_FORBIDDEN_WORDS = "words";

	public static final String MMT_EXPIRE_1MONTH_AFTER = "3";//����ͨ���ں�һ���º�

	public static final int MAXNUM_BUSINSERIES = 100;//�û�����Ŀ¼�����

	/**�̻������������������ࡪ�ɹ�*/
	public static final String SUPCATID_BUY_OTHER="035001";

	//���̴߳�����Ϣ���̸߳���
	public static final int nThreads = 30;
	/**�������� ����*/
	public static final int OPTYPE_ADD=0;
	/**�������� �޸�*/
	public static final int OPTYPE_EDIT=1;
	/**�������� ɾ��*/
	public static final int OPTYPE_DELETE=2;
	/**�������� �ط�*/
	public static final int OPTYPE_REPEAT=3;
	/**�������� ����*/
	public static final int OPTYPE_UPGRADE=4;
	/**�������� ����*/
	public static final int OPTYPE_DEGRADE=5;
	/**�������� ���*/
	public static final int OPTYPE_AUTHEN=6;
	/**�������� ����*/
	public static final int OPTYPE_REFUSE=7;
	/**�������� ����*/
	public static final int OPTYPE_DROP=8;
	
}