package com.Spring.learnspring.framework.a0.Game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GameConsole {

	public void up()
	{
		System.out.println("kick");
	}
	public void down()
	{
		System.out.println("down kick");
	}
	public void left()
	{
		System.out.println("back kick");
	}
	public void right()
	{
		System.out.println("front kick");
	}
}
