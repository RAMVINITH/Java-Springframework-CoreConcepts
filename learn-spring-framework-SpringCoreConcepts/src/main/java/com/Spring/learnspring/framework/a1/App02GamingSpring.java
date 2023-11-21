package com.Spring.learnspring.framework.a1;

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
@ComponentScan("com.Spring.learnspring.framework.Game")
@Qualifier("SuperContraQualifier")
public class App02GamingSpring {
	

	public static void main(String[] args) 
	{
		
		try (var context = new AnnotationConfigApplicationContext(App02GamingSpring.class))
		{
//			context.getBean(GameConsole.class).down();
			
			context.getBean(GameRunner.class).run();
		} 
			

	}

}
