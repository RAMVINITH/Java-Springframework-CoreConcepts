package com.Spring.learnspring.framework.a4.Example.BusinessCalcualtionService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySqlDataService implements DataService {
	
	public int[] retrieveData()
	{
		return new int[] {11,22,33,44,55};
	}
}
