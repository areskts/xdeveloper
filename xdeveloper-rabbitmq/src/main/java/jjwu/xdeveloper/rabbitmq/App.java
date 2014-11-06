package jjwu.xdeveloper.rabbitmq;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Hello world!
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( value ={"classpath*:/conf/applicationContext.xml"})
public class App 
{
	
	@Resource
	private RabbitTemplate rabbitTemplate;
    
    @Test
    public void test() throws Throwable{

    	System.out.println("发送消息");
    	rabbitTemplate.convertSendAndReceive("iwgame.xcloud.oms.center.exchange", "nodeid", "test");
    	int i = 0;
    	while (true) {
    		i +=1;
    		Thread.sleep(1000);
    		System.out.println(i);
    		if(i == 40){
    			break;
    		}
		}
    }
}
