package com.Spring.learnspring.framework.a6.BeanScopes_PostConstructAndPreDestroy;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass
{
   SomeDependency somedep;
   
   SomeClass(SomeDependency somedep)
   {
	   this.somedep=somedep;
   }
   
   
   // postconstruct annotation help to some perform action after dependency injection and before doing service
   @PostConstruct
   public void initialize()
   {
	   System.out.println("Perfome initilize");
   }
   
   //preDestroy used to perform some process or cleanup operation before application close
   //if we want to perform action before bean is removed from container , predestroy will be recommended
   @PreDestroy
   public void cleanup()
   {
	   System.out.println("Perform Cleanup");
   }
   
}

@Component
class SomeDependency
{

}




@Configuration
@ComponentScan
public class PostConstructAndPreDestroyAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context= new AnnotationConfigApplicationContext(PostConstructAndPreDestroyAnnotation.class))
		{
		     Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}

}
