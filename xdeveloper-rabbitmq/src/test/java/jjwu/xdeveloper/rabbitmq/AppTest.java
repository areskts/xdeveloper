package jjwu.xdeveloper.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.core.Binding.DestinationType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = { "/conf/applicationContext.xml" })
public class AppTest {
	
	@Test
	public void test(){
		new TopicExchange("iwgame.xcloud.ioms.center.exchange");
		new Queue("iwgame.xcloud.ioms.nodeid.queue", true);
		new Binding("iwgame.xcloud.ioms.nodeid.queue",DestinationType.QUEUE,"iwgame.xcloud.ioms.center.exchange","nodeid#share",null);
		
	}
	
	
}
