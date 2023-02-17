
package com.sss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Generic {
	public static void main(String args[]) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		ListIterator<Integer> L = l1.listIterator();
		System.out.println("Traversing in Forward direction");
		while(L.hasNext()) {
		System.out.println(L.next());
		}
		System.out.println("Traversing in reverse direction");
		while(L.hasPrevious()) {
		System.out.println(L.previous());
		}
		}
	}
