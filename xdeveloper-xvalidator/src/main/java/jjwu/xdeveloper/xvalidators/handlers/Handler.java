/****************************************************************
 *  文件名     ： Handler.java
 *  日期         :  2012-8-14
 *  Company: 上海绿岸网络科技有限公司
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           		All Rights Reserved.
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.xvalidators.handlers;

import java.lang.reflect.Field;

import jjwu.xdeveloper.xvalidators.annotation.Ivalidator;
import jjwu.xdeveloper.xvalidators.exeception.XvalidatorException;


/**
 * 
 * @类名:   Handler 
 * @描述:  	处理类接口
 *
 * @作者:   吴君杰
 * @邮箱:	wujunjie@iwgame.com
 * @日期:	2012-8-14下午06:18:34
 * @版本:   1.0
 */
public interface Handler {
	
	 public void validate(Ivalidator targetObj, Field field) throws XvalidatorException;

}
