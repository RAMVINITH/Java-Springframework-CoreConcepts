package com.Spring.learnspring.framework.a8.JakartaContextDependencyInjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component instead of component annotation we can use name annotation in jakarta
@Named
class classA
{
   classB b;

  public classB getClassB() {
	return b;
  }
// @Autowired instead of we can use inject annotation in jakarta
  @Inject
  public void setClassB(classB somedep) {
	this.b = somedep;
  }   
}

@Component
class classB
{

}




@Configuration
@ComponentScan
public class jakartaCDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context= new AnnotationConfigApplicationContext(jakartaCDI.class))
		{
//		     Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		     System.out.println(context.getBean(classA.class).getClassB());
		}

	}

}
