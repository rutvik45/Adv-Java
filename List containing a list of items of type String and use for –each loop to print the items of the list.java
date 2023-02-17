
package com.sss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generic {
	public static void main(String args[]) {
		List<String> l1 = new ArrayList<>();
		l1.add("1st element");
		l1.add("2nd element");
		l1.add("3rd element");
		l1.add("4th element");
		l1.add("5th element");
		for(String str : l1) {
		System.out.println(str+" ");
		}
		}
	}
