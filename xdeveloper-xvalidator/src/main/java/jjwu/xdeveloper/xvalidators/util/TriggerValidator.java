/****************************************************************
 *  文件名   	:	TriggerValidator.java
 *  日期		:  	2013-4-28
 *  Company: 上海绿岸网络科技有限公司
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           		All Rights Reserved.
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.xvalidators.util;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @描述:	TODO(...)
 *
 * @作者:	吴君杰
 * @邮箱:	wujunjie@iwgame.com
 * @日期:	2013-4-28 下午5:41:23
 * @版本:   	v1.0.0
 */
@Aspect
@Component
public class TriggerValidator{

	@Pointcut("execution(* jjwu.xdeveloper.xvalidators.bean.UsersBean.get*())")
	public void validators(){

	}

	public TriggerValidator(){
		System.out.println("----- init -----");
	}


	@Before("jjwu.xdeveloper.xvalidators.util.TriggerValidator.validators()")
	public void invokerBefore()  {
		System.out.println("------@Before-------");
	}

	@After("jjwu.xdeveloper.xvalidators.util.TriggerValidator.validators()")
	public void invokerAfter()  {
		System.out.println("------@After-------");
	}

	@Around("jjwu.xdeveloper.xvalidators.util.TriggerValidator.validators()")
	public void invokerAround()  {
		System.out.println("-----@Around--------");
	}
}
