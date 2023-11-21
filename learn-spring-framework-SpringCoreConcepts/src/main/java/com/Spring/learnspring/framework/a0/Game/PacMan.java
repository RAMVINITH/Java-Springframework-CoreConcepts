package com.Spring.learnspring.framework.a0.Game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GameConsole {

	
	public void up()
	{
		System.out.println("Up");
	}
	public void down()
	{
		System.out.println("Down");
	}
	public void left()
	{
		System.out.println("left");
	}
	public void right()
	{
		System.out.println("right");
	}
}


