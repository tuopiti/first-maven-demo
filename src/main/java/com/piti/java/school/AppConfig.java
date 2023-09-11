package com.piti.java.school;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.piti.java.school")
public class AppConfig {
	
	/*
	@Bean
	public Game game(){
		//return new MarioGame();
		return new ZoombieGame();
	}

	@Bean
	public GameRunner gameRunner(Game game) {
		return new GameRunner(game);
	}
	*/
}
