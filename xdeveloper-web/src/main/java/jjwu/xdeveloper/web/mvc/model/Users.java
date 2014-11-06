/****************************************************************
 *  文件名   	:	UsersBean.java
 *  日期		:  	2013-4-28
 *  Company: 上海绿岸网络科技有限公司
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           		All Rights Reserved.
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.web.mvc.model;

import jjwu.xdeveloper.xvalidators.annotation.Ivalidator;
import jjwu.xdeveloper.xvalidators.annotation.NotEmpty;

/**
 * @描述:	TODO(...)
 *
 * @作者:	吴君杰
 * @邮箱:	wujunjie@iwgame.com
 * @日期:	2013-4-28 下午5:06:37
 * @版本:   	v1.0.0
 */
public class Users implements Ivalidator{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6557768468140179884L;

	@NotEmpty
	private String username;

	@NotEmpty
	private String password;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}



}
