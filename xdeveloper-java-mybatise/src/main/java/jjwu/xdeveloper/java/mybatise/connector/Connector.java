package jjwu.xdeveloper.java.mybatise.connector;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class Connector {
	
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public <T> List<T> selectList(final String statement) throws Exception{
		return sqlSessionTemplate.selectList(statement);
	}
	
	public <T> List<T> selectList(final String statement,final Object params) throws Exception{
		return sqlSessionTemplate.selectList(statement,params);
	}

}
