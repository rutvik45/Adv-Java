
package com.sss;

import java.util.Arrays;
import java.util.List;

public class Generic {
public static void printInteger(List<? super Integer> list)
{
System.out.println(list);
}
public static void main(String[] args)
{
List<Integer> list1= Arrays.asList(4,5,6,7);
printInteger(list1);
List<Integer> list2= Arrays.asList(4,5,6,7);
printInteger(list2);
}
}
