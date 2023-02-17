package com.sss;
public class Generic {
public static void main (String[] args)
{ EqualityClass ec = new EqualityClass();
ec.<Integer>checking(1,2);
ec.<Integer>checking(2,2);
ec.<String>checking("Hello 100","Hello 100");
ec.<String>checking("Hi","Bye");
}
}
class EqualityClass{
public <T> void checking(T d1, T d2) {
if (d1.equals(d2)) {
System.out.println(d1+" and "+d2+" are equal");
}else {
System.out.println(d1+" and "+d2+" are not equal");
} } 
