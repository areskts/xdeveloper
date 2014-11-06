/****************************************************************
 * 文件名 : s.java
 * 日期 : 2013-6-13
 * Company: 上海绿岸网络科技有限公司
 * (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 * All Rights Reserved.
 * 注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.web.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

/**
 * @描述: TODO(...)
 * 
 * @作者: 吴君杰
 * @邮箱: wujunjie@iwgame.com
 * @日期: 2013-6-13 上午11:12:11
 * @版本: v1.0.0
 */
public abstract class BaseAction {

	public static void render(HttpServletResponse response, String text, String contentType) {
		try {
			response.setContentType(contentType);
			response.getWriter().write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void renderText(HttpServletResponse response, String text) {
		try {
			response.setContentType("text/plain;charset=UTF-8");
			response.getWriter().write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected static void renderJson(HttpServletResponse response, Object object) {
		try {
			BaseAction.render(response, JSONObject.fromObject(object).toString(), "text/plain;charset=UTF-8");
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
