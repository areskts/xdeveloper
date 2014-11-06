package jjwu.xdeveloper.spring.aop;

import org.springframework.stereotype.Component;

/**
 * 
 * @描述: TODO(...)
 * 
 * @作者: 吴君杰
 * @邮箱: wujunjie@iwgame.com
 * @日期: 2013-5-3 下午3:13:45
 * @版本: v1.0.0
 */
@Component
public class AppDaoImpl implements AppDao{

	public AppDaoImpl(){
		System.out.println("AppDaoImpl init");
	}

	@Override
	public String getUserName() {
		return "My Name is JJwu";
	}

}
