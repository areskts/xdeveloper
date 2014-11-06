/****************************************************************
 *  文件名     ：RegExHandler.java
 *  日期         :  2012-8-14
 *  Company: 上海绿岸网络科技有限公司
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           		All Rights Reserved.
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.xvalidators.handlers;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jjwu.xdeveloper.xvalidators.annotation.Ivalidator;
import jjwu.xdeveloper.xvalidators.annotation.RegEx;
import jjwu.xdeveloper.xvalidators.exeception.XvalidatorException;
import jjwu.xdeveloper.xvalidators.util.GetFiledValue;


/**
 * 
 * @类名:   RegExHandler 
 * @描述:  	正则表达式处理类
 *
 * @作者:   吴君杰
 * @邮箱:	wujunjie@iwgame.com
 * @日期:	2012-8-14下午06:21:51
 * @版本:   1.0
 */
public class RegExHandler implements Handler {


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.tony.annotation.validators.Handler#validate(org.tony.annotation.
	 * validators.IwAnnotation, java.lang.reflect.Field)
	 */
	@Override
	public void validate(Ivalidator filter, Field field) throws XvalidatorException {
		// TODO Auto-generated method stub
		if (field.isAnnotationPresent(RegEx.class)) {
			checkRegx(filter, field);
		}

	}

	private void checkRegx(Ivalidator filter, Field field) throws XvalidatorException {
		RegEx validateRegx = field.getAnnotation(RegEx.class);
		String regex = validateRegx.regex();
		String message = validateRegx.errmsg();
		String fieldValue = "";
		fieldValue = String.valueOf(GetFiledValue.getFieldValue(filter, field.getName()));
		if (fieldValue != null && !"".equals(fieldValue.toString().trim())) {
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(fieldValue);
			if (!matcher.matches()) {
				throw new XvalidatorException("Validate Field:[" + field.getName() +"] fail, value=" + fieldValue + " But " + message);
			}
		}
	}

}
