package org.aishwary;

import org.aishwary.model.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String args[]){
	ConfigurableApplicationContext configurableApplicationContext=new ClassPathXmlApplicationContext("spring.xml");
	System.out.println("Before first refresh "+configurableApplicationContext);
	configurableApplicationContext.refresh();
	HelloWorld helloWorld=configurableApplicationContext.getBean("helloWorld",HelloWorld.class);
	System.out.println(helloWorld.getMessage());
	configurableApplicationContext.refresh();
	System.out.println("After last refresh "+configurableApplicationContext);
	configurableApplicationContext.close();
	configurableApplicationContext.refresh();
	configurableApplicationContext.start();

	}
}
