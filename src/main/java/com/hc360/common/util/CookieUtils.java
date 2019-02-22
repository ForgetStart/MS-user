package com.hc360.common.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Cookies读写工具类
 * 
 * @author xiezs
 * 
 */
public class CookieUtils {
	static Logger logger = Logger.getLogger(CookieUtils.class.getName());

	public CookieUtils() {
	}

	/**
	 * 根据名称查询Cookie值
	 * @param request 
	 * @param name cookie名称
	 * @return cookie值 没有查询到name对应的cookie则返回null
	 */
	public static String getCookieValue(HttpServletRequest request, String name) {
		String cookieValue = null;

		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			return null;
		}

		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals(name)) {
				return cookies[i].getValue();
			}
		}

		String cookieStr = request.getHeader("cookie");
		String[] cookiess = cookieStr.split(";");
		for (int i = 0; i < cookiess.length; i++) {
			String cookie = cookiess[i].trim();
			if (cookie.startsWith(name + "=")) {// 判断的是cookie的名称
				cookieValue = cookie.substring(name.length() + 1);
				break;
			}
		}
		return cookieValue;
	}
	
	/**
	 * 记录Cookie
	 * @param response
	 * @param value cookie值
	 * @param age 生命周期
	 * @param path 路径
	 * @param domain 域
	 */
	public static void addCookie(HttpServletResponse response,String name,String value,int age,String path,String domain){ 
		Cookie cookie = new Cookie(name,value);
		cookie.setMaxAge(age);
		cookie.setPath("/");
		cookie.setDomain(domain);
		response.addCookie(cookie);
	}
	
	public static void addCookie(HttpServletResponse response,String name,String value,String domain){ 
		Cookie cookie = new Cookie(name,value);
		cookie.setPath("/");
		cookie.setDomain(domain);
		response.addCookie(cookie);
	}
	
	/**
	 * 删除cookie
	 * @param response
	 * @param name
	 * @param age
	 * @param path
	 * @param domain
	 */
	public static void delCookie(HttpServletResponse response,String name,String path,String domain){
		Cookie cookie = new Cookie(name,null);
		cookie.setMaxAge(0);
		cookie.setPath("/");
		cookie.setDomain(domain);
		response.addCookie(cookie);
	}
	
	/**
	 * 获得cookie的id
	 * @param request
	 * @return
	 */
	
	public static String getCookieid(HttpServletRequest request){
		/*
		Enumeration e = request.getHeaderNames();
		while (e.hasMoreElements()) {
		String name = (String)e.nextElement();
		String value = request.getHeader(name);
		System.out.println(name + " = " + value);
		}
*/		
		//获得唯一cookie的id用于监控用户状态
		String reqcookie = request.getHeader("cookie");
		String cookieid = null;
		if(reqcookie!=null){
			String[] sstr = reqcookie.split(";");
			String temps="";
				for (int i=0;i<sstr.length;i++){
					if (sstr[i].indexOf("WT_FPC=")>=0){
						temps = sstr[i];
						temps = temps.trim();
						temps = temps.substring(7, temps.length());
						break;
					}
				}
			
				if (temps != null){
					String[]  cstr = temps.split(":");
					String ctemps="";
						for (int i=0;i<cstr.length;i++){
							if (cstr[i].indexOf("id=")>=0){
								ctemps = cstr[i];
								ctemps= ctemps.trim();
								cookieid = ctemps.substring(3,ctemps.length());
								break;
							}
						}
				}	
		}
		return cookieid;
		}
	
	/*
	* 对应javascript的unescape()函数, 可对javascript的escape()进行解码
	*/
	public static String unescape(String src) {
	   StringBuffer tmp = new StringBuffer();
	   tmp.ensureCapacity(src.length());
	   int lastPos = 0, pos = 0;
	   char ch;
	   while (lastPos < src.length()) {
	    pos = src.indexOf("%", lastPos);
	    if (pos == lastPos) {
	     if (src.charAt(pos + 1) == 'u') {
	      ch = (char) Integer.parseInt(src
	        .substring(pos + 2, pos + 6), 16);
	      tmp.append(ch);
	      lastPos = pos + 6;
	     } else {
	      ch = (char) Integer.parseInt(src
	        .substring(pos + 1, pos + 3), 16);
	      tmp.append(ch);
	      lastPos = pos + 3;
	     }
	    } else {
	     if (pos == -1) {
	      tmp.append(src.substring(lastPos));
	      lastPos = src.length();
	     } else {
	      tmp.append(src.substring(lastPos, pos));
	      lastPos = pos;
	     }
	    }
	   }
	   return tmp.toString();
	}
	/**
	 * 获得cookie的id
	 * @param cookiestr 从cookie的字符
	 * @param channel 1:  supply 2:  buy 4:  company 5:  product 6:  info 7:  tech 9:  forum 10: blog11:  job
	 * @param count 取几个cookie中的词
	 * @return
	 */
	public static String getCookiestrKeywordDesc(String cookiestr,int channel,int count){
		StringBuilder keyword= new StringBuilder();
		
		if (cookiestr == null|| !(cookiestr.length() > 0))  return"";
		String []  keys_array = cookiestr.split("#");
		int key_num = keys_array.length-1;
		if(key_num<count){
			count = 0;
		}
		for(int i=key_num;i>=0&&i>=count;i--) {
			String [] arr = keys_array[i].split("[*]");
			String type = "", classcode = "", areacode  = "", cattype = "", key = "";
			if (arr.length >= 5) {
				type = arr [0];
				classcode = arr[1];
				areacode = arr[2];
				cattype = arr[3];
				key = "";
				for(int j = 4; j < arr.length; j++) {
					key += arr[j] + "*";
				}
				key = key.substring(0, key.length() - 1);
			} else {
			    type = keys_array[i].substring(keys_array[i].length()-3,keys_array[i].length());
				key = keys_array[i].substring(0,keys_array[i].length()-3);
			}
			key = unescape(key);
			String c = "";
			String newchannel = "[" + channel + "]";
			if (type == "[8]") {
				type = "[4]";
			} else if (type == "[9]") {
				type = "[5]";
			}
			if (type.equals(newchannel)) {
				
				keyword.append(key+",");
			}
		}
		 return	keyword.toString();
		
		
	}
	/**
	 * 获得cookie的id
	 * @param cookiestr 从cookie的字符
	 * @param channel 1:  supply 2:  buy 4:  company 5:  product 6:  info 7:  tech 9:  forum 10: blog11:  job
	 * @param count 取几个cookie中的词
	 * @param order排序 0 从前到后 1 从后到前
	 * @return
	 */
	public static String getCookiestrKeywordAsc(String cookiestr,int channel,int count){
		StringBuilder keyword= new StringBuilder();
		
		if (cookiestr == null|| !(cookiestr.length() > 0))  return"";
		String []  keys_array = cookiestr.split("#");
		int key_num = keys_array.length;
		if(key_num>10){
			key_num = 10;
		}
		for(int i=0;i<key_num&&i<count;i++) {
			String [] arr = keys_array[i].split("[*]");
			String type = "", classcode = "", areacode  = "", cattype = "", key = "";
			if (arr.length >= 5) {
				type = arr [0];
				classcode = arr[1];
				areacode = arr[2];
				cattype = arr[3];
				key = "";
				for(int j = 4; j < arr.length; j++) {
					key += arr[j] + "*";
				}
				key = key.substring(0, key.length() - 1);
			} else {
			    type = keys_array[i].substring(keys_array[i].length()-3,keys_array[i].length());
				key = keys_array[i].substring(0,keys_array[i].length()-3);
			}
			key = unescape(key);
			String c = "";
			String newchannel = "[" + channel + "]";
			if (type == "[8]") {
				type = "[4]";
			} else if (type == "[9]") {
				type = "[5]";
			}
			if (type.equals(newchannel)) {
				
				keyword.append(key+",");
			}
		}
		 return	keyword.toString();
		
		
	}
	/**
	 * 获得cookie的id
	 * @param cookiestr 从cookie的字符
	 * @param channel 1:  supply 2:  buy 4:  company 5:  product 6:  info 7:  tech 9:  forum 10: blog11:  job
	 * @param order排序 0升序 降序  1 
	 * @return
	 */
	public static String getCookiestrKeyword(String cookiestr,int channel,int count,int order){
		String str ="";
		if(order==0){
			str = getCookiestrKeywordDesc(cookiestr,channel,count);	
		}else if(order ==1){
			str = getCookiestrKeywordAsc(cookiestr,channel,count);	
		}
		return str;
	}
	/**
	 * 获得cookie的id
	 * @param cookiestr 从cookie的字符
	 * @param channel 1:  supply 2:  buy 4:  company 5:  product 6:  info 7:  tech 9:  forum 10: blog11:  job
	 * @return
	 */
	public static String getCookiestrKeyword(String cookiestr,int channel){
		return getCookiestrKeyword(cookiestr,channel,10,0);	
	}
	
}
