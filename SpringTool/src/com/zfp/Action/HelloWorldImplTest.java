package com.zfp.Action;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldImplTest {

	@Test
	public final void testSayHello() {
		//读取配置文件实例化一个IOC容器
		ApplicationContext context = new ClassPathXmlApplicationContext("HelloWorld.xml");
		//使用xml的配置获取helloworldimpl的对象 （面向接口）
		HelloWorldImpl hwi = context.getBean("helloWorld",HelloWorldImpl.class);
		//测试接口函数
		hwi.sayHello();
	}

}
