/****************************************************************
 *  文件名   	:	UsersBean.java
 *  日期		:  	2013-4-28
 *  Company: 上海绿岸网络科技有限公司
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           		All Rights Reserved.
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.web.mvc.controller;

import java.io.Serializable;

/**
 * @描述:	TODO(...)
 *
 * @作者:	吴君杰
 * @邮箱:	wujunjie@iwgame.com
 * @日期:	2013-4-28 下午12:00:20
 * @版本:   	v1.0.0
 */
public class Users implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3597698698593138893L;

	private String name;
	private String pass;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(final String pass) {
		this.pass = pass;
	}


}
