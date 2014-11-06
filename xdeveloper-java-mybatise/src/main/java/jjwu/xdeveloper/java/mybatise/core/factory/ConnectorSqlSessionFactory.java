/****************************************************************
 *  文件名     ： ConnectorSqlSessionFactory.java
 *  日期         :  2012-10-31
 *  Company: 上海绿岸网络科技有限公司
 *  (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 *           		All Rights Reserved.
 *  注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.java.mybatise.core.factory;

import java.util.Hashtable;
import java.util.Map;

import jjwu.xdeveloper.java.mybatise.core.DBConnectFailedException;
import jjwu.xdeveloper.java.mybatise.core.dynamic.datasource.DynamicDataSource;
import jjwu.xdeveloper.java.mybatise.core.dynamic.datasource.DynamicDataSourceHandler;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.core.io.Resource;

/**
 * @描述: TODO(...)
 * 
 * @作者: 吴君杰
 * @邮箱: wujunjie@iwgame.com
 * @日期: 2012-12-11下午02:49:41
 * @版本: v1.0
 */
public class ConnectorSqlSessionFactory {

	private final Logger logger = Logger.getLogger(ConnectorSqlSessionFactory.class);

	private final Map<String, SqlSessionFactory> sqlSessionFactoryPool = new Hashtable<String, SqlSessionFactory>();

	private DynamicDataSource dataSource;

	private final SqlSessionFactoryBean sqlSessionFactoryBean;

	public void setDataSource(DynamicDataSource dynamicDataSource) {
		this.dataSource = dynamicDataSource;
	}

	public void setConfigLocation(Resource configLocation) {
		sqlSessionFactoryBean.setConfigLocation(configLocation);
	}

	public void setMapperLocations(Resource[] mapperLocations) {
		sqlSessionFactoryBean.setMapperLocations(mapperLocations);
	}

	/**
	 * TODO: 无参构造函数
	 */
	public ConnectorSqlSessionFactory() {
		sqlSessionFactoryBean = new SqlSessionFactoryBean();
	}

	public SqlSessionFactory getSqlSessionFactory(String bdName) {

		SqlSessionFactory factory = sqlSessionFactoryPool.get(bdName);

		try {
			if (null == factory) {
				synchronized (this) {
					if(null == factory){
						// 切换数据库
						DynamicDataSourceHandler.settingDataSource(bdName);

						// 设置数据源
						sqlSessionFactoryBean.setDataSource(dataSource);

						// 重新构建 SessionFactory
						sqlSessionFactoryBean.afterPropertiesSet();

						// 得到SqlSessionFactory
						factory = sqlSessionFactoryBean.getObject();

						// 缓存连接池
						sqlSessionFactoryPool.put(bdName, factory);

						return factory;
					}
				}
			}
			return factory;
		} catch (Exception e) {
			logger.error("创建SqlSessionTemplate失败!", e);
			throw new DBConnectFailedException(e.getMessage());
		}

	}
}
