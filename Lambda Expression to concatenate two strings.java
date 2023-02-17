package com.sss;

import java.util.*;

interface Display{
public String say(String a,String b);

}

public class Generic {

public static void main(String[] args) {
System.out.println("Lamba Expression Demonstration with return statement");
Display display = (String a,String b) -> { return a+b; };

System.out.println("Returns value from lambda expression = "+display.say("Ashvin","Shetty"));

}
}
