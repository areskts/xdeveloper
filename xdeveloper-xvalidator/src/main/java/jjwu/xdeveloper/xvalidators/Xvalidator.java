/****************************************************************
 * 文件名 ：Xvalidator.java
 * 日期 : 2012-8-14
 * Company: 上海绿岸网络科技有限公司
 * (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 * All Rights Reserved.
 * 注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.xvalidators;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import jjwu.xdeveloper.xvalidators.annotation.Ivalidator;
import jjwu.xdeveloper.xvalidators.exeception.XvalidatorException;
import jjwu.xdeveloper.xvalidators.handlers.Handler;
import jjwu.xdeveloper.xvalidators.util.GetFiledValue;

/**
 * 
 * @类名: Xvalidator
 * @描述: javaBean字段验证器,用于后台数据交验
 * 
 * @作者: 吴君杰
 * @邮箱: wujunjie@iwgame.com
 * @日期: 2012-10-25上午09:19:38
 * @版本: 1.0
 */
public final class Xvalidator {

	private final static String SUFFIX = "Handler";

	private final static String PACKAGE = "jjwu.xdeveloper.xvalidators.annotation";

	private final static String HANDLERPACKAGE = "jjwu.xdeveloper.xvalidators.handlers";

	private static Xvalidator validator = new Xvalidator();

	private Xvalidator() {

	}

	public static Xvalidator getInstance() {
		return validator;
	}

	public boolean validate(final Ivalidator targetObj) {
		try {
			if (null == targetObj) {
				return false;
			}
			Class<?> currentClass = targetObj.getClass();
			while (currentClass != null) {
				final Field[] fields = currentClass.getDeclaredFields();
				for (final Field elem : fields) {
					validateField(targetObj, elem);
				}
				final Class<?> superClass = currentClass.getSuperclass();
				currentClass = Ivalidator.class.isAssignableFrom(superClass) ? superClass : null;
			}
		} catch (final XvalidatorException e) {
			return false;
		} catch (final Throwable e) {
			return false;
		}
		return true;
	}

	/**
	 * @param targetObj
	 * @throws XvalidatorException
	 */
	public void validateEx(final Ivalidator targetObj) throws XvalidatorException {
		try {
			if (null == targetObj) {
				throw new XvalidatorException("Validate Object is NULL.");
			}
			Class<?> currentClass = targetObj.getClass();
			while (currentClass != null) {
				final Field[] fields = currentClass.getDeclaredFields();
				for (final Field elem : fields) {
					validateField(targetObj, elem);
				}
				final Class<?> superClass = currentClass.getSuperclass();
				currentClass = Ivalidator.class.isAssignableFrom(superClass) ? superClass : null;
			}
		} catch (final XvalidatorException ex) {
			throw ex;
		} catch (final Throwable oe) {
			throw new XvalidatorException(oe.getMessage());
		}
	}

	private void validateField(final Ivalidator targetObj, final Field field) throws XvalidatorException {
		// check whether the field is also Ivalidator
		if (Ivalidator.class.isAssignableFrom(field.getType())) {
			Object destValue = null;
			try {
				destValue = GetFiledValue.getFieldValue(targetObj, field.getName());
			} catch (final Exception ex) {
				throw new XvalidatorException("Get field value or cast value error for field " + field.getName()
						+ " in Class " + targetObj.getClass() + ". Error message: " + ex.getMessage(), ex);
			}
			if (destValue == null) {
				return; // NULL value is allowed.
			} else {
				validate((Ivalidator) destValue);
			}
		}

		final List<Annotation> annotations = getValidateAnnotations(field);
		if (annotations != null && annotations.size() > 0) {
			// loop each field annotations
			for (final Annotation annotation : annotations) {
				final String annotationName = annotation.annotationType().getName();
				String className = annotationName + SUFFIX;
				className = className.replace(PACKAGE, HANDLERPACKAGE);
				Handler handler = null;
				try {
					handler = (Handler) Class.forName(className).newInstance();
				} catch (final Exception ex) {
					throw new XvalidatorException();
				}
				handler.validate(targetObj, field);
			}
		}
	}

	/**
	 * get self field annotations
	 * 
	 * @param field
	 * @return
	 */
	private List<Annotation> getValidateAnnotations(final Field field) {
		final List<Annotation> annotations = new ArrayList<Annotation>();
		final Annotation[] annos = field.getAnnotations();
		for (final Annotation elem : annos) {
			final String classToString = elem.annotationType().toString();
			if (classToString.indexOf(PACKAGE) > 0) {
				annotations.add(elem);
			}
		}
		return annotations;
	}
}
