package com.hc360.common.page;

/*
 * $Id: Page.java,v 1.3 2012/07/20 05:47:44 sunw Exp $
 * Copyright(c) 2000-2007 HC360.COM, All Rights Reserved.
 */

import java.io.Serializable;
import java.util.List;

/**
 * ��ҳ��ѯ���Bean
 * @author zhaosy
 * @version 4.0 2007-4-17
 * @since 4.0
 */
public class Page implements Serializable{

	/***/
	private static final long serialVersionUID = 1L;
	
	/** ��ѯ��� */
	private List lstResult;
	/** ��ҳ��ϢBean */
	private PageBean pageBean;
	
	/**
	 * (��)
	 */
	public Page() {}
	
	/**
	 * ���ݲ�ѯ�������ҳ��Ϣ����
	 * @param lstResult ��ѯ���
	 * @param pageBean ��ҳ��ϢBean
	 */
	public Page(List lstResult, PageBean pageBean) {
		this.lstResult = lstResult;
		this.pageBean = pageBean;
	}
	
	/**
	 * ȡ�ò�ѯ���
	 * @return ��ѯ���
	 */
	public List getLstResult() {
		return lstResult;
	}
	/**
	 * ���ò�ѯ���
	 * @param lstResult ��ѯ���
	 */
	public void setLstResult(List lstResult) {
		this.lstResult = lstResult;
	}
	
	/**
	 * ȡ�÷�ҳ��ϢBean
	 * @return ��ҳ��ϢBean
	 */
	public PageBean getPageBean() {
		return pageBean;
	}
	/**
	 * ���÷�ҳ��ϢBean
	 * @param pageBean ��ҳ��ϢBean
	 */
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}
}
