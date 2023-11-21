package com.Spring.learnspring.framework.a4.Example.BusinessCalcualtionService;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessClassCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        try(var context=new AnnotationConfigApplicationContext(BusinessClassCalculation.class))
        {
//		     Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		     
		     System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }

	}

}
