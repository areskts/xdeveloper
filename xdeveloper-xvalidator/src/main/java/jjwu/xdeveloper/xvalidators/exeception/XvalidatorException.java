/****************************************************************
 *  文件名     ： ValidateException.java
 *  日期         :  2012-8-14
 *  Company: 上海绿岸网络科技有限公司
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           		All Rights Reserved.
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.xvalidators.exeception;

/**
 * 
 * @类名:   XvalidatorException 
 * @描述:  	自定义验证异常
 *
 * @作者:   吴君杰
 * @邮箱:	wujunjie@iwgame.com
 * @日期:	2012-8-14下午06:19:13
 * @版本:   1.0
 */
public class XvalidatorException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2984670859403718716L;
	
	public XvalidatorException(){
		super();
	}

	public XvalidatorException(Exception ex) {
		super(ex.getMessage(), ex);
	}

	public XvalidatorException(String message) {
		super(message);
	}

	public XvalidatorException(String message, Exception ex) {
		super(message, ex);
	}
}
