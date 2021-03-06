/**
 * ResponseUtil.java 2012-7-19 上午11:28:49 author:liusz
 *
 * Copyright(c) 2000-2012 HC360.COM, All Rights Reserved.
 */
package com.hc360.common.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Response帮组类
 * @author hk
 * @date 2012-7-19 上午11:28:49
 * @version 1.0
 * @since 1.0
 * */
public class ResponseUtil {
	/**
	 * 发送文本。使用GBK编码。
	 * @param response	HttpServletResponse
	 * @param text		发送的字符串
	 */
	public static void renderText(HttpServletResponse response, String text) {
		render(response, "text/plain;charset=GBK", text);
	}

	/**
	 * 发送json。使用GBK编码。
	 * @param response	HttpServletResponse
	 * @param text		 发送的字符串
	 */
	public static void renderJsonByGBK(HttpServletResponse response, String text) {
		render(response, "application/json;charset=GBK", text);
	}
	/**
	 * 发送json。使用UTF-8编码。
	 * @param response	HttpServletResponse
	 * @param text		 发送的字符串
	 */
	public static void renderJsonByUTF8(HttpServletResponse response, String text) {
		render(response, "application/json;charset=UTF-8", text);
	}

	/**
	 * 发送xml。使用GBK编码。
	 * @param response	HttpServletResponse
	 * @param text		 发送的字符串
	 */
	public static void renderXml(HttpServletResponse response, String text) {
		render(response, "text/xml;charset=GBK", text);
	}

	/**
	 * 发送内容。使用UTF-8编码。
	 * @param response
	 * @param contentType
	 * @param text
	 */
	public static void render(HttpServletResponse response, String contentType, String text) {
		response.setContentType(contentType);
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		try {
			response.getWriter().write(text);
		} catch (IOException e) {
            e.printStackTrace();
		}
	}

}
