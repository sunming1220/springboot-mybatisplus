package com.example;

import com.example.activemq.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisplusApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private Producer producer;

	@Test
	public void test(){
		ActiveMQQueue destination = new ActiveMQQueue("test.queue");
		producer.sendMessage(destination,"my name is sunming");


	}
}
