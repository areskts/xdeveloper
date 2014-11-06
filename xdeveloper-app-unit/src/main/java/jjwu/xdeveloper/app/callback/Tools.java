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
 * @日期: 2013-4-28 上午10:29:31
 * @版本: v1.0.0
 */
public class Tools {

	/**
	 * 测试函数使用时间，通过定义CallBack接口的execute方法
	 * 
	 * @param callBack
	 */
	public void testTime(final CallBack callBack) {
		final long begin = System.currentTimeMillis(); // 测试起始时间
		callBack.execute(); // /进行回调操作
		final long end = System.currentTimeMillis(); // 测试结束时间
		System.out.println("[use time]:" + (end - begin)); // 打印使用时间
	}

	public static void main(final String[] args) {
		final Tools tool = new Tools();
		tool.testTime(new CallBack() {
			// 定义execute方法
			@Override
			public void execute() {
				// 这里可以加放一个或多个要测试运行时间的方法
				CommonTest.testMethod();
			}
		});
	}

}
