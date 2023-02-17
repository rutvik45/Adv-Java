package com.sss;
import java.util.*;
public class Generic {

public static void main(String[] args) {

Set<String> s1 = new TreeSet<>();
s1.add("C++");
s1.add("Java");
s1.add("C#");

Iterator<String> itr = s1.iterator();

System.out.println("Traverse in forward direction");
while(itr.hasNext()) {
System.out.println(itr.next());
}

System.out.println("Traverse in reverse direction");
List<String> l1 = new ArrayList<String>(s1);
Collections.reverse(l1);
for(String language:l1) {
System.out.println(language);
}

}

}
