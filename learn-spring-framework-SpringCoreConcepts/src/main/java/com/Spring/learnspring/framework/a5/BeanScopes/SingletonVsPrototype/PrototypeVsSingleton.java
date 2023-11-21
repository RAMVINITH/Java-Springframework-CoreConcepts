package com.Spring.learnspring.framework.a5.BeanScopes.SingletonVsPrototype;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class ClassNormal
{
	
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ClassPrototype
{
  
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
class ClassSingleton
{
  
}





@Configuration
@ComponentScan
public class PrototypeVsSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context= new AnnotationConfigApplicationContext(PrototypeVsSingleton.class))
		{
			//normal class getting same instance of class for same class
			System.out.println(context.getBean(ClassNormal.class));
			System.out.println(context.getBean(ClassNormal.class));
			
			//single class is same as normal class
			//by mentioning scope as single , it will create one object instance per spring IOC container
			System.out.println(context.getBean(ClassSingleton.class));
			System.out.println(context.getBean(ClassSingleton.class));
			
			//prototype class getting different instance of class  for same class
			//Everytime it will create different instance obj of the class
			System.out.println(context.getBean(ClassPrototype.class));
			System.out.println(context.getBean(ClassPrototype.class));
			System.out.println(context.getBean(ClassPrototype.class));
			System.out.println(context.getBean(ClassPrototype.class));
		}

	}

}
