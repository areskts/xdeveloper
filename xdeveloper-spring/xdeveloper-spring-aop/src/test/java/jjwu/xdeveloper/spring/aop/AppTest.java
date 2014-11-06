package jjwu.xdeveloper.spring.aop;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = { "classpath*:/conf/applicationContext.xml" })
public class AppTest {

	@Resource
	private AppDao appDao;

	@Test
	public void testApp() {
		System.out.println(appDao.getUserName());
	}
}
