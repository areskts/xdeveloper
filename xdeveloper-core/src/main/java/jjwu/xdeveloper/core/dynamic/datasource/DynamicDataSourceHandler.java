/****************************************************************
 *  文件名     ： DynamicDataSourceHandler.java
 *  日期         :  2012-10-30
 *  Company: 上海绿岸网络科技有限公司
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           		All Rights Reserved.
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.core.dynamic.datasource;

/**
 * @描述: TODO(...)
 * 
 * @作者: 吴君杰
 * @邮箱: wujunjie@iwgame.com
 * @日期: 2012-12-10下午03:31:07
 * @版本: v1.0
 */
public class DynamicDataSourceHandler {

	private static final ThreadLocal<String> holder = new ThreadLocal<String>();

	public static void settingDataSource(String name) {
		holder.set(name);
	}

	public static String getDataSourceName() {
		return holder.get();
	}
	
	public static void removeDataSourceName(){
		holder.remove();
	}

}
