package com.Spring.learnspring.framework.a0.Game;

import org.springframework.stereotype.Component;

@Component
public class Mario implements GameConsole {

	
	public void up()
	{
		System.out.println("Jump");
	}
	public void down()
	{
		System.out.println("in to hole");
	}
	public void left()
	{
		System.out.println("going back");
	}
	public void right()
	{
		System.out.println("moving forward");
	}
}


