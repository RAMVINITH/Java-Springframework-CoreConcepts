package com.Spring.learnspring.framework.a0.Game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	GameConsole game;
	public GameRunner(@Qualifier("SuperContraQualifier") GameConsole game)
	{
		this.game=game;
	}
	public void run()
	{
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
