package com.Spring.learnspring.framework.a4.Example.BusinessCalcualtionService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {

	DataService dataservice;

	 public BusinessCalculationService(@Qualifier("MangoDdQualifier") DataService dataservice) {
		this.dataservice = dataservice;
	}

	public int findMax()
	 {
		return Arrays.stream(dataservice.retrieveData()).max().orElse(0);
			
	
	}
	 

}
