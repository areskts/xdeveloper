/****************************************************************
 * 文件名 ： DBConnection.java
 * 日期 : 2012-10-31
 * Company: 上海绿岸网络科技有限公司
 * (C) Copyright Green Shore Network Technology Co.,Ltd.2012
 * All Rights Reserved.
 * 注意： 本内容仅限于上海绿岸网络科技有限公司内部使用，禁止转发
 ****************************************************************/
package jjwu.xdeveloper.java.mybatise.core.dynamic;

import java.util.List;

import javax.annotation.Resource;

import jjwu.xdeveloper.java.mybatise.core.dynamic.datasource.DynamicDataSourceHandler;
import jjwu.xdeveloper.java.mybatise.core.factory.ConnectorSqlSessionFactory;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

/**
 * @描述: 动态数据源封装
 *
 * @作者: 吴君杰
 * @邮箱: wujunjie@iwgame.com
 * @日期: 2012-12-11下午03:18:20
 * @版本: v1.0
 */
@Component
@SuppressWarnings("unchecked")
public class DBConnection {

		@Resource
		private ConnectorSqlSessionFactory connectorSqlSessionFactory;

		private SqlSessionTemplate getCilent(final String bdName) {

			// 得到sqlSessionFactory
			final SqlSessionFactory sqlSessionFactory = connectorSqlSessionFactory.getSqlSessionFactory(bdName);

			// 更换连接池
			DynamicDataSourceHandler.settingDataSource(bdName);

			final SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory);
			return template;
		}

		public <T> List<T> selectList(final String dbkey, final String statement, final Object params) {
			return (List<T>) getCilent(dbkey).selectList(statement, params);
		}

		public <T> List<T> selectList(final String dbkey, final String statement) {
			return (List<T>) getCilent(dbkey).selectList(statement);
		}

		public <T> List<T> selectOne(final String dbkey, final String statement, final Object params) {
			return (List<T>) getCilent(dbkey).selectOne(statement, params);
		}

		public <T> List<T> selectOne(final String dbkey, final String statement) {
			return (List<T>) getCilent(dbkey).selectOne(statement);
		}

		public int update(final String dbkey, final String statement) {
			return getCilent(dbkey).update(statement);
		}

		public int update(final String dbkey, final String statement, final Object params) {
			return getCilent(dbkey).update(statement, params);
		}

		public int delete(final String dbkey, final String statement) {
			return getCilent(dbkey).delete(statement);
		}

		public int delete(final String dbkey, final String statement, final Object params) {
			return getCilent(dbkey).delete(statement, params);
		}

}
