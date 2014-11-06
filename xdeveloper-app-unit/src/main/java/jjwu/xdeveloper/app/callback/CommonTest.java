/****************************************************************
 * 文件名 : s.java
 * 日期 : 2013-4-28
 * Company: 上海绿岸网络科技有限公司
 * (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 * All Rights Reserved.
 * 注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.app.callback;

/**
 * @描述: TODO(...)
 * 
 * @作者: 吴君杰
 * @邮箱: wujunjie@iwgame.com
 * @日期: 2013-4-28 上午10:28:13
 * @版本: v1.0.0
 */
public class CommonTest {
	/**
	 * 一个用来被测试的方法，进行了一个比较耗时的循环
	 */
	public static void testMethod() {
		for (int i = 0; i < 100000000; i++) {

		}
	}

	/**
	 * 一个简单的测试方法执行时间的方法
	 */
	public void testTime() {
		final long begin = System.currentTimeMillis(); // 测试起始时间
		testMethod(); // 测试方法
		final long end = System.currentTimeMillis(); // 测试结束时间
		System.out.println("[use time]:" + (end - begin)); // 打印使用时间
	}

	public static void main(final String[] args) {
		final CommonTest test = new CommonTest();
		test.testTime();
	}
}
