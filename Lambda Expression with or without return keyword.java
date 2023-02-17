package com.sss;

import java.util.*;

interface Display{
public int say(int a);

}

public class Generic {

public static void main(String[] args) {
System.out.println("Lamba Expression Demonstration with return statement");
Display display = (int a) -> { return a; };

System.out.println("Returns value from lambda expression = "+display.say(5));

}

}
