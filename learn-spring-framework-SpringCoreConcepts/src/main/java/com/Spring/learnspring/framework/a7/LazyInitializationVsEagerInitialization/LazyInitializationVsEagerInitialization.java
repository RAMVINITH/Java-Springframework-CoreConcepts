package com.Spring.learnspring.framework.a7.LazyInitializationVsEagerInitialization;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
class ClassA
{
	ClassA()
	{
		System.out.print("From classA constructor............");
	}
}
// without lazy annotation , spring calls their bean's constructor and initialize by default
//To prevent this situation , we are lazy annotation to restrict the default call from spring to their specific bean
//Eager is default and lazy annotation we have mention
@Component
@Lazy
class ClassB
{
	ClassA classA;
	ClassB(	ClassA classA)
	{
		System.out.print("From classB constructor............");
		this.classA=classA;
	}
}




@Configuration
@ComponentScan
public class LazyInitializationVsEagerInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context= new AnnotationConfigApplicationContext(LazyInitializationVsEagerInitialization.class))
		{
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}

	}

}
