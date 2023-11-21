package com.Spring.learnspring.framework.a2.Example;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Spring.learnspring.framework.a0.Game.GameConsole;
import com.Spring.learnspring.framework.a0.Game.GameRunner;
import com.Spring.learnspring.framework.a0.Game.PacMan;
import com.Spring.learnspring.framework.a0.Game.SuperContra;

@Configuration
public class SimpleSpringContextLauncherApplication {
	

	public static void main(String[] args) 
	{
		
		try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class))
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} 
			

	}

}
