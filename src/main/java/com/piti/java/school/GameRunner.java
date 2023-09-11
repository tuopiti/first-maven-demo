package com.piti.java.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//	private ZoombieGame zoombieGame;
	
//	public GameRunner(ZoombieGame zoombieGame) {
//		this.zoombieGame = zoombieGame;
//	}
	
	
	@Autowired
	private Game game;
	public GameRunner(Game game) {
		this.game = game;
	}
	
	public void runGame() {
		game.up();
		game.left();
	}
}
