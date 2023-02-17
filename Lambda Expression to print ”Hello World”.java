package com.sss;

import java.util.*;

interface Greetings{
public void sayHelloWorld(String name);
}



public class Generic {
	public static void main(String[] args) {
		System.out.println("Lamba Expression Demonstration");
		Greetings greet = (name)-> System.out.println("Hello "+name);
		greet.sayHelloWorld("Ashvin");
	}
}
