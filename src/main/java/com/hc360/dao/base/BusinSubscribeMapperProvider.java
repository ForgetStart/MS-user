package com.hc360.dao.base;


import com.hc360.common.constants.SubscibeConstants;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * 分类 操作类
 *
 * */
public class BusinSubscribeMapperProvider {


	public static String isRepeatKeyWord(@Param("providerid") long providerid,@Param("keyword")String keyword,@Param("supcatid") String supcatid, @Param("id")long id, @Param("infotype")String infotype) {
		return new SQL() {
			{
				StringBuilder whereSql = new StringBuilder();

				SELECT("SUBS_ID as id,SUPCATID,KEYWORD,CLSID,INFOTYPE,ZONE,PUBDATE,CHECKED,CHECKEDATE,TRADE,PROVINCEID,CITYID," +
						"PROVIDERID,SUBTYPE,ISSEND,ISREPEAT,UPDATETIME,STATES,DELDATE,VALIDATE_TIME as validatetime");
				FROM("SUBSCRIB_TABLE a ");

				whereSql.append("a.subtype = '1' and a.providerid=#{providerid} and a.states ='0'");

				if (StringUtils.isBlank(keyword)) {
					whereSql.append(" and a.keyword is null and a.supcatid=#{supcatid}");
				} else {
					whereSql.append(" and lower(a.keyword)=#{keyword}");
				}

				if (StringUtils.isNotBlank(supcatid)) {
					whereSql.append(" and a.supcatid=#{supcatid}");
				} else {
					whereSql.append(" and a.supcatid='000'");
				}
				// 判断修改
				if (id != 0) {
					whereSql.append(" and a.id!=#{id}");
				}
				/*
				 * 判断供求类别
				 */
				if (StringUtils.isNotBlank(infotype)) {
					if (infotype.trim().equals("0,1")) {
						whereSql.append(" and a.infotype in ('0,1','1','0')");
					} else if (infotype.trim().equals("1")) {
						whereSql.append(" and a.infotype in ('1','0,1')");
					} else if (infotype.trim().equals("0")) {
						whereSql.append(" and a.infotype in ('0','0,1')");
					}
				}
				WHERE(whereSql.toString());
			}
		}.toString();

	}


}
