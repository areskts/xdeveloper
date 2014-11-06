/****************************************************************
 *  文件名     ：IntTypeHandler.java
 *  日期         :  2012-9-4
 *  Company: 上海绿岸网络科技有限公司
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           		All Rights Reserved.
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.xvalidators.handlers;

import java.lang.reflect.Field;

import jjwu.xdeveloper.xvalidators.annotation.IntType;
import jjwu.xdeveloper.xvalidators.annotation.Ivalidator;
import jjwu.xdeveloper.xvalidators.exeception.XvalidatorException;
import jjwu.xdeveloper.xvalidators.util.GetFiledValue;


/**
 * 
 * @类名:   IntTypeHandler 
 * @描述:  	数字验证处理类
 *
 * @作者:   吴君杰
 * @邮箱:	wujunjie@iwgame.com
 * @日期:	2012-8-15上午10:20:29
 * @版本:   1.0
 */
public class IntTypeHandler implements Handler {

	@Override
	public void validate(Ivalidator validatedObj, Field field) throws XvalidatorException {
		if (field.isAnnotationPresent(IntType.class)) {
			checkInt(validatedObj, field);
		}
	}

	/**
	 * validate the int type
	 * 
	 * @param filter
	 *            validated object
	 * @param field
	 *            validated field or property
	 * @throws XvalidatorException
	 */
	private void checkInt(Ivalidator filter, Field field) throws XvalidatorException {
		IntType annotation = field.getAnnotation(IntType.class);
		int min = annotation.min();
		int max = annotation.max();
		String message = annotation.errmsg();
		
		Object sourValue = GetFiledValue.getFieldValue(filter, field.getName());
		
		if (sourValue == null) {
			throw new XvalidatorException(message + "The value is:" + sourValue);
		}

		Integer destValue = null;
		
		try {
			destValue = Integer.valueOf(sourValue.toString());
		} catch (Exception ex) {
			throw new XvalidatorException(ex.getMessage(), ex);
		}

		if (destValue == null) {
			throw new XvalidatorException(message + "The value is:" + destValue);
		}
		
		int value = destValue.intValue();

		if (value < min) {
			throw new XvalidatorException(message + "The value is:" + value + ",The min value should is:" + min);
		}

		if (value > max) {
			throw new XvalidatorException(message + "The value is:" + value + ",The max value should is:" + max);
		}
	}
}
