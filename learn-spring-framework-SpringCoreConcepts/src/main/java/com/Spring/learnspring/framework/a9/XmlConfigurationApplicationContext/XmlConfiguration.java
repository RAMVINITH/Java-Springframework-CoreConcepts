package com.Spring.learnspring.framework.a9.XmlConfigurationApplicationContext;

import java.util.Arrays;


import org.springframework.context.support.ClassPathXmlApplicationContext;






public class XmlConfiguration {
	

	public static void main(String[] args) 
	{
		
		try (var context = new ClassPathXmlApplicationContext("ContextConfiguration.xml"))
		{
			
		   Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} 
			

	}

}
