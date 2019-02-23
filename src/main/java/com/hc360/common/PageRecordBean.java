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
 * JDBC方式查询结果每记录对象
 * @author zhaosy
 * @version 4.0 2007-4-12
 * @since 4.0
 */
public class PageRecordBean {
	/** 每记录存储结果映射 */
	private final Map<String, Object> columnMap = new HashMap<String, Object>();
	/** 每记录存储结果列表 */
	private final List<Object> lstColumn = new ArrayList<Object>();
	
	/**
	 * 根据记录集当前指向对象构造记录内容
	 * @param rs 查询记录集
	 * @throws MmtException 记录集操作发生异常
	 */
	public PageRecordBean(ResultSet rs) throws MmtException {
		if (rs == null) return;
		setResultColumnInfo(rs);
	}
	
	/**
	 * 构造函数调用，保存记录集当前指向记录信息
	 * @param rs 记录集
	 * @throws MmtException 保存记录信息时发生异常
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
			throw new MmtException("记录集操作发生异常", e);
		}
	}
	
	/**
	 * 根据返回结果记录集中列名取得对应记录信息
	 * @param columnName 列名，Oracle对应列名，不能使用Hibernate持久类中列名
	 * @return 指定列信息
	 */
	public Object getValue(String columnName) {
		return columnMap.get(columnName.toLowerCase());
	}
	/**
	 * 根据返回结果记录集中列名取得对应记录字符串信息
	 * @param columnName 列名，Oracle对应列名，不能使用Hibernate持久类中列名
	 * @return 指定列字符串信息
	 */
	public String getString(String columnName) {
		return Convert.getString(columnMap.get(columnName.toLowerCase()));
	}
	
	
	/**
	 * 根据返回结果记录集中列名取得对应记录时间信息
	 * @param columnName 列名，Oracle对应列名，不能使用Hibernate持久类中列名
	 * @return 指定列时间信息
	 * @throws MmtException 
	 */
	public Timestamp getTimestamp(String columnName) throws MmtException {
		Object object = columnMap.get(columnName.toLowerCase());
		return getTimestamp(object);
		
	}
	
	/**
	 * 返回结果中时间信息类型
	 * @author chenxinwei
	 * @version 1.0
	 * @date 2014年5月14日 下午5:58:58
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
				throw new MmtException("返回结果记录集中，获取时间数据类型错误！" + object.getClass().getName());
			}
		}
		return null;
	}
	/**
	 * 根据返回结果记录集中列名取得对应记录长整形信息
	 * @param columnName 列名，Oracle对应列名，不能使用Hibernate持久类中列名
	 * @return 指定列时间信息
	 * @throws MmtException 
	 */
	public long getLong(String columnName) throws MmtException {
		Object object = columnMap.get(columnName.toLowerCase());
		return getLong(object);
		
	}
	/**
	 * 返回结果中长整形信息类型
	 * @author chenxinwei
	 * @version 1.0
	 * @date 2014年5月20日 下午5:51:19
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
	 * 返回结果记录集中，获取长整形信息类型
	 * @author chenxinwei
	 * @version 1.0
	 * @date 2014年5月20日 下午5:51:19
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
				throw new MmtException("返回结果记录集中，获取长整形数据类型错误！" + object.getClass().getName());
			}
		}
		return 0;
	}

	/**
	 * 根据返回结果记录集中列名取得对应记录时间信息
	 * @param columnName 列名，Oracle对应列名，不能使用Hibernate持久类中列名
	 * @return 指定列时间信息
	 * @throws MmtException 
	 */
	public Timestamp getTimestamp(int idx) throws MmtException {
		Object object = lstColumn.get(idx);
		return getTimestamp(object);
		
	}
	/**
	 * 根据列编号取得记录信息
	 * @param idx 列编号，从零开始
	 * @return 记录信息
	 */
	public Object getValue(int idx) {
		return lstColumn.get(idx);
	}
	/**
	 * 根据列编号取得记录字符串信息
	 * @param idx 列编号，从零开始
	 * @return 记录字符串信息
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
