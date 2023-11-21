package com.Spring.learnspring.framework.a3.Example;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.Spring.learnspring.framework.a0.Game.GameConsole;
import com.Spring.learnspring.framework.a0.Game.GameRunner;
import com.Spring.learnspring.framework.a0.Game.PacMan;
import com.Spring.learnspring.framework.a0.Game.SuperContra;


@Component
class BusinessClass
{
	Dependency1 dependency1;
	Dependency2 dependency2;
	
	
// without calling construct,Spring automatically call constructor  	
	public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}
	public String toString()
	{
		return "using " + dependency1 + " and " + dependency2;
		
	}

}

@Component
class Dependency1
{}

@Component
class Dependency2
{}

@Configuration
@ComponentScan
public class DepInjectionLauncherApp {
	

	public static void main(String[] args) 
	{
		
		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApp.class))
		{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessClass.class));
		} 
		
		
			

	}
	
	

}
