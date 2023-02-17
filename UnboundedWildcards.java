
package com.sss;

import java.util.Arrays;
import java.util.List;

public class Generic {
	private static void display(List<?> list)
	{
	System.out.println(list);
	}
	public static void main(String[] args)
	{
	List<Integer> list1= Arrays.asList(1,2,3);
	List<Double> list2=Arrays.asList(1.1,2.2,3.3);
	display(list1);
	display(list2);
	}
	}
