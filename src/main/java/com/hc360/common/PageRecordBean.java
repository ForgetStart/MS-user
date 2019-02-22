/*
 * $Id: PageRecordBean.java,v 1.10 2014/08/03 23:03:57 sunw Exp $
 * Copyright(c) 2000-2007 HC360.COM, All Rights Reserved.
 */
package com.hc360.common;

import com.hc360.b2b.exception.MmtException;
import com.hc360.b2b.util.Convert;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JDBC��ʽ��ѯ���ÿ��¼����
 * @author zhaosy
 * @version 4.0 2007-4-12
 * @since 4.0
 */
public class PageRecordBean {
	/** ÿ��¼�洢���ӳ�� */
	private final Map<String, Object> columnMap = new HashMap<String, Object>();
	/** ÿ��¼�洢����б� */
	private final List<Object> lstColumn = new ArrayList<Object>();
	
	/**
	 * ���ݼ�¼����ǰָ��������¼����
	 * @param rs ��ѯ��¼��
	 * @throws MmtException ��¼�����������쳣
	 */
	public PageRecordBean(ResultSet rs) throws MmtException {
		if (rs == null) return;
		setResultColumnInfo(rs);
	}
	
	/**
	 * ���캯�����ã������¼����ǰָ���¼��Ϣ
	 * @param rs ��¼��
	 * @throws MmtException �����¼��Ϣʱ�����쳣
	 */
	private final void setResultColumnInfo(ResultSet rs) throws MmtException {
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			int colCnt = rsmd.getColumnCount();
			for (int i = 1; i <= colCnt; i++) {
				String colName = rsmd.getColumnName(i).toLowerCase();
				Object value = rs.getObject(i);
				columnMap.put(colName, value);
				lstColumn.add(value);
			}
		} catch (SQLException e) {
			throw new MmtException("��¼�����������쳣", e);
		}
	}
	
	/**
	 * ���ݷ��ؽ����¼��������ȡ�ö�Ӧ��¼��Ϣ
	 * @param columnName ������Oracle��Ӧ����������ʹ��Hibernate�־���������
	 * @return ָ������Ϣ
	 */
	public Object getValue(String columnName) {
		return columnMap.get(columnName.toLowerCase());
	}
	/**
	 * ���ݷ��ؽ����¼��������ȡ�ö�Ӧ��¼�ַ�����Ϣ
	 * @param columnName ������Oracle��Ӧ����������ʹ��Hibernate�־���������
	 * @return ָ�����ַ�����Ϣ
	 */
	public String getString(String columnName) {
		return Convert.getString(columnMap.get(columnName.toLowerCase()));
	}
	
	
	/**
	 * ���ݷ��ؽ����¼��������ȡ�ö�Ӧ��¼ʱ����Ϣ
	 * @param columnName ������Oracle��Ӧ����������ʹ��Hibernate�־���������
	 * @return ָ����ʱ����Ϣ
	 * @throws MmtException 
	 */
	public Timestamp getTimestamp(String columnName) throws MmtException {
		Object object = columnMap.get(columnName.toLowerCase());
		return getTimestamp(object);
		
	}
	
	/**
	 * ���ؽ����ʱ����Ϣ����
	 * @author chenxinwei
	 * @version 1.0
	 * @date 2014��5��14�� ����5:58:58
	 * @param object
	 * @return 
	 * Timestamp
	 * @throws MmtException 
	 */
	
	private Timestamp getTimestamp(Object object) throws MmtException {
		if (object != null) {
			if (object instanceof Date) {
				
				return new Timestamp(((Date)object).getTime());
				
			} else if (object instanceof Timestamp) {
				return (Timestamp)object;
				
			} else {
				throw new MmtException("���ؽ����¼���У���ȡʱ���������ʹ���" + object.getClass().getName());
			}
		}
		return null;
	}
	/**
	 * ���ݷ��ؽ����¼��������ȡ�ö�Ӧ��¼��������Ϣ
	 * @param columnName ������Oracle��Ӧ����������ʹ��Hibernate�־���������
	 * @return ָ����ʱ����Ϣ
	 * @throws MmtException 
	 */
	public long getLong(String columnName) throws MmtException {
		Object object = columnMap.get(columnName.toLowerCase());
		return getLong(object);
		
	}
	/**
	 * ���ؽ���г�������Ϣ����
	 * @author chenxinwei
	 * @version 1.0
	 * @date 2014��5��20�� ����5:51:19
	 * @param object
	 * @return 
	 * long
	 * @throws MmtException 
	 */
	public long getLong(int idx) throws MmtException {
		Object object = lstColumn.get(idx);
		return getLong(object);
	}
	
	/**
	 * ���ؽ����¼���У���ȡ��������Ϣ����
	 * @author chenxinwei
	 * @version 1.0
	 * @date 2014��5��20�� ����5:51:19
	 * @param object
	 * @return 
	 * long
	 * @throws MmtException 
	 */
	
	private long getLong(Object object) throws MmtException {
		if (object != null) {
			if (object instanceof BigDecimal) {
				BigDecimal d = ((BigDecimal)object);
				return (d!=null ? d.longValue() : 0L);
				
			} else if (object instanceof Long) {
				return (Long)object;
				
			} else if (object instanceof Integer) {
				return (Integer)object;
				
			} else {
				throw new MmtException("���ؽ����¼���У���ȡ�������������ʹ���" + object.getClass().getName());
			}
		}
		return 0;
	}

	/**
	 * ���ݷ��ؽ����¼��������ȡ�ö�Ӧ��¼ʱ����Ϣ
	 * @param columnName ������Oracle��Ӧ����������ʹ��Hibernate�־���������
	 * @return ָ����ʱ����Ϣ
	 * @throws MmtException 
	 */
	public Timestamp getTimestamp(int idx) throws MmtException {
		Object object = lstColumn.get(idx);
		return getTimestamp(object);
		
	}
	/**
	 * �����б��ȡ�ü�¼��Ϣ
	 * @param idx �б�ţ����㿪ʼ
	 * @return ��¼��Ϣ
	 */
	public Object getValue(int idx) {
		return lstColumn.get(idx);
	}
	/**
	 * �����б��ȡ�ü�¼�ַ�����Ϣ
	 * @param idx �б�ţ����㿪ʼ
	 * @return ��¼�ַ�����Ϣ
	 */
	public String getString(int idx) {
		return Convert.getString(lstColumn.get(idx));
	}

	public Map<String, Object> getColumnMap() {
		return columnMap;
	}

	public List<Object> getLstColumn() {
		return lstColumn;
	}
	
}
