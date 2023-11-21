package com.Spring.learnspring.framework.a4.Example.BusinessCalcualtionService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MangoDdQualifier")
public class MangoDBDataService implements DataService{

	public int[] retrieveData()
	{
		return new int[] {1,2,3,4,5};
	}
}
