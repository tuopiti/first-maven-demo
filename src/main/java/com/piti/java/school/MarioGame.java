package com.piti.java.school;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements Game{
	
	public void up(){
		System.out.println("Jump");
	}
	
	public void down(){
		System.out.println("Sit");
	}
	
	public void left(){
		System.out.println("Left");
	}
	
	public void right(){
		System.out.println("Right");
	}
}
