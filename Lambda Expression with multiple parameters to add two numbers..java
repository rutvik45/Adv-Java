package com.sss;

import java.util.*;

interface Greetings{
	public void sayHelloWorld(int a,int b);
}

public class Generic {
	public static void main(String[] args) {
		System.out.println("Lamba Expression Demonstration");
		Greetings greet = (a,b)-> System.out.println("Square "+(a+b));
		greet.sayHelloWorld(10,76);
	}
}
