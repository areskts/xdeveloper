/****************************************************************
 *  文件名     ： IntType.java
 *  日期         :  2012-8-15
 *  Company: 上海绿岸网络科技有限公司
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           		All Rights Reserved.
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.xvalidators.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @类名:   IntType 
 * @描述:  	数字交验注解
 *
 * @作者:   吴君杰
 * @邮箱:	wujunjie@iwgame.com
 * @日期:	2012-8-15下午06:01:27
 * @版本:   1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IntType {

    int min() default Integer.MIN_VALUE;

    int max() default Integer.MAX_VALUE;

    String errmsg() default "Value of the integer is not in expected scope.";
}
