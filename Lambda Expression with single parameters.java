package com.sss;

import java.util.*;

interface Greetings{
	public void sayHelloWorld(int a);
}

public class Generic {
	public static void main(String[] args) {
		System.out.println("Lamba Expression Demonstration");
		Greetings greet = (a)-> System.out.println("Square "+(a*a));
		greet.sayHelloWorld(10);
	}
}
