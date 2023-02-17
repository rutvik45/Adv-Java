package com.sss;

import java.util.*;

public class Generic {

public static void main(String[] args) {
Set<String> s1 = new TreeSet<>();
s1.add("C++");
s1.add("Java");
s1.add("C#");

Set<String> s2 = new TreeSet<>();
s2.add("Python");
s2.add("Javascript");
s2.add("Swift");
Iterator<String> itr = s1.iterator();

System.out.println("Before adding");
while(itr.hasNext()) {
System.out.println(itr.next());
}

s1.addAll(s2);

Iterator<String> itr2 = s1.iterator();

System.out.println("After adding");
while(itr2.hasNext()) {
System.out.println(itr2.next());
}

if(s1.contains("C#")) {
s1.remove("C#");
}

System.out.println("After deletion:\n");
System.out.println(s1);

}

}
