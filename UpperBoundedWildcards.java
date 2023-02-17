package com.sss;
import java.util.*;
public class UpperBound {
public static void display(List<? extends Number> list) {
System.out.print(list);
}
public static void main(String args[]) {
List<Integer> list1= Arrays.asList(4,5,6,7);
display(list1);
}
}
