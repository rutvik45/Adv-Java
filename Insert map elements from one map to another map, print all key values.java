package com.sss;

import java.util.*;

public class Generic {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"Ashvin");
		map.put(2,"Rutvik");
		map.put(3,"Rushikesh");

		Map<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(1,"Ashvin");
		map2.put(2,"Rutvik");
		map2.put(3,"Rushikesh");

		map.forEach((k,v)-> System.out.println(k+" "+v));

		map.putAll(map2);

		for(Integer key:map.keySet()) {
		System.out.println("key: "+key);
		}

		for(String value:map.values()) {
		System.out.println("key: "+value);
		}
	}
}
