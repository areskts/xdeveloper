/****************************************************************
 * 文件名 : AspectDemo.java
 * 日期 : 2013-4-28
 * Company: 上海绿岸网络科技有限公司
 * (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 * All Rights Reserved.
 * 注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @描述: TODO(...)
 * 
 * @作者: 吴君杰
 * @邮箱: wujunjie@iwgame.com
 * @日期: 2013-4-28 下午5:41:23
 * @版本: v1.0.0
 */
@Aspect
@Component
public class AspectDemo {

	@Pointcut("execution(* jjwu.xdeveloper.spring.aop.AppDaoImpl.get*())")
	public void validators() {

	}

	public AspectDemo() {
		System.out.println("----- init -----");
	}

	@Before("jjwu.xdeveloper.spring.aop.AspectDemo.validators()")
	public void invokerBefore() {
		System.out.println("------@Before-------");
	}

	@After("jjwu.xdeveloper.spring.aop.AspectDemo.validators()")
	public void invokerAfter() {
		System.out.println("------@After-------");
	}

	@Around("jjwu.xdeveloper.spring.aop.AspectDemo.validators()")
	public void invokerAround() {
		System.out.println("-----@Around--------");
	}
}
