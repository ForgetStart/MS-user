package com.hc360.common.page;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

import static java.lang.Math.min;

/**
 * ��ҳ��ѯBean
 * @author zhsosy 2007-3-22
 * @version 1.0 JDK1.5.0_06
 */
public class PageBean implements Serializable{

	/** ��ҳ��ѯĬ�Ϸ��ؼ�¼�� */
	public static final int DEF_PAGE_VIEW_SIZE = 20;
	/***/
	private static final long serialVersionUID = 1L;
	/** ��ǰҳ */
	private int page;
	/** ��ǰҳ��ʾ��¼���� */
	private int pageSize;
	/** ȡ�ò�ѯ�ܼ�¼�� */
	private int count;
	/** 
	 * ��������
	 * <li>0���޶���</li> 
	 * <li>1����ҳ</li> 
	 * <li>2��ǰһҳ</li> 
	 * <li>3����һҳ</li> 
	 * <li>4��ĩҳ</li> 
	 * <li>5����תҳ</li> 
	 * <li>6�������趨ÿҳ��¼��</li> 
	 */
	private int actionType;
	
	
	public PageBean() {}
	
	/**
	 * @param request 
	 */
	public PageBean(HttpServletRequest request) {
		try {
			this.setPageSize(16);
			if (request.getParameter("page") != null)
			this.setPage(Integer.valueOf(request.getParameter("page")));	
			if (request.getParameter("count") != null)
			this.setCount(Integer.valueOf(request.getParameter("count")));
			if (request.getParameter("actionType") != null)
			this.setActionType(Integer.valueOf(request.getParameter("actionType")));
		} catch (Exception e) {}
	}
	
	/**
	 * ���ݵ�ǰ��ʾҳ��ÿҳ��ʾ��¼�����ò�ѯ��Ϣ��ʼ����
	 * @param page ��ǰ��ʾҳ��
	 * @param pageSize ��ǰҳ��ʾ��¼����
	 */
	public PageBean(int page, int pageSize) {
		this.page = (page <= 0) ? 1 : page;
		this.pageSize = (pageSize <= 0) ? DEF_PAGE_VIEW_SIZE : pageSize;
	}
	
	/**
	 * ȡ�ö�������
	 * @return ��������
	 */
	public int getActionType() {
		return actionType;
	}
	/**
	 * ���ö�������
	 * @param actionType ��������
	 */

	public void setActionType(int actionType) {
		this.actionType = actionType;
	}

	/**
	 * ȡ�õ�ǰ��ʾҳ��
	 * @return ��ǰ��ʾҳ��
	 */
	public int getPage() {
		return (page <= 0) ? 1 : page;
	}
	/**
	 * ���õ�ǰҳ
	 * @param page ��ǰҳ
	 */
	public void setPage(int page) {
		this.page = page;
	}
	
	/**
	 * ȡ�õ�ǰ��ʾҳ�������ʾ����
	 * @return ��ǰ��ʾҳ�������ʾ����
	 */
	public int getPageSize() {
		return (pageSize <= 0) ? DEF_PAGE_VIEW_SIZE : pageSize;
	}
	/**
	 * ���õ�ǰҳ��ʾ��¼����
	 * @param pageSize ��ǰҳ��ʾ��¼����
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	/**
	 * ȡ�ò�ѯȡ�ü�¼����
	 * @return ȡ�ò�ѯȡ�ü�¼����
	 */
	public int getCount() {
		return count;
	}
	/**
	 * ���ò�ѯȡ�ü�¼����
	 * @param count ��ѯȡ�ü�¼����
	 */
	public void setCount(int count) {
		this.count = (count < 0) ? 0 : count;
		if (this.count == 0) {
			this.page = 0;
			return;
		}
		switch (actionType) {
		case 1:		//��һҳ
			this.page = 1;
			break;
		case 2:		//ǰһҳ
			this.page = min(getPages(), this.page - 1);
			break;
		case 3:		//��һҳ
			this.page = min(getPages(), this.page + 1);
			break;
		case 4:		//��ĩҳ
			this.page = getPages();
			break;
		case 5:		//ָ��ҳ
		case 6:		//�����趨ÿҳ��ʾ����ʱ
		case 0:		//���趨ʱ
		default:
			this.page = min(getPages(), getPage());
		}
		
	}
	
	/**
	 * ȡ�õ�ǰ��ѯ��ҳ��
	 * @return ��ǰ��ѯ��ҳ��
	 */
	public int getPages() {
		return (count + getPageSize() - 1) / getPageSize();
	}
	/**
	 * ȡ����ʼ��ʾ��¼��
	 * @return ��ʼ��ʾ��¼��
	 */
	public int getStartNo() {
		return ((getPage() - 1) * getPageSize() + 1);
	}
	/**
	 * ȡ�ý�����ʾ��¼��
	 * @return ������ʾ��¼��
	 */
	public int getEndNo() {
		return Math.min(getPage() * getPageSize(), count);
	}
	
	/**
	 * ȡ��ǰһ��ʾҳ��
	 * @return ǰһ��ʾҳ��
	 */
	public int getPrePageNo() {
		return Math.max(getPage() - 1, 1);
	}
	
	/**
	 * ȡ�ú�һ��ʾҳ��
	 * @return ��һ��ʾҳ��
	 */
	public int getNextPageNo() {
		return Math.min(getPage() + 1, getPages());
	}
}
