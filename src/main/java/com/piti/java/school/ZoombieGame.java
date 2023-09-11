package com.piti.java.school;

import org.springframework.stereotype.Component;

@Component
public class ZoombieGame implements Game{
	
	public void up(){
		System.out.println("Go up");
	}
	
	public void down(){
		System.out.println("Go down");
	}
	
	public void left(){
		System.out.println("Go left");
	}
	
	public void right(){
		System.out.println("Go right");
	}
}
