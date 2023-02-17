// Create a java project
// delete module.java from src
// create package in src
// create class
// Class name should be same

package com.sss;
class Demo<T>
{
T d;
public Demo(T data) {
this.d =data;
}
public T getData() {
return d;
}
}
class Generic{
public static void main (String[] args)
{
Demo<Integer> d1 = new Demo<>(100);
Demo<String> d2 = new Demo<>("This is string");
System.out.println("Displaying Integer data "+d1.getData());
System.out.println("Displaying String data "+d2.getData());
}
}
