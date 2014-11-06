/****************************************************************
 *  文件名     ： DynamicDataSource.java
 *  日期         :  2012-10-30
 *  Company: 上海绿岸网络科技有限公司
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           		All Rights Reserved.
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.java.mybatise.core.dynamic.datasource;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/** 
 * @描述:  	TODO(...) 
 *
 * @作者:   吴君杰
 * @邮箱:	wujunjie@iwgame.com
 * @日期:	2012-12-10下午03:27:31
 * @版本:   v1.0 
 */
public class DynamicDataSource extends AbstractRoutingDataSource{
	
	private Map<Object, Object> targetDataSources;

	@Override
	protected Object determineCurrentLookupKey() {
		return DynamicDataSourceHandler.getDataSourceName();
	}

	@Override
	public void setTargetDataSources(Map<Object, Object> targetDataSources) {
		this.targetDataSources = targetDataSources;
		super.setTargetDataSources(targetDataSources);
		afterPropertiesSet();
	}
	
	/**
	 * 
	 * @说明: 添加数据库
	 * @return: void
	 */
	public void addTargetDataSource(String key, DataSource dataSource){
		this.targetDataSources.put(key, dataSource);
		this.setTargetDataSources(targetDataSources);
	}
}
