package com.piti.java.school;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        //ZoombieGame game = new ZoombieGame(); //manual create
    	//MarioGame game = new MarioGame();      //manual create
    	
    	//GameRunner gameRunner = new GameRunner(game);
       
        //gameRunner.runGame();
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	GameRunner gameRunner = context.getBean(GameRunner.class);
    	gameRunner.runGame();
    }
}
