package com.legacy;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(5);
		list.add(200);
		list.add(110);
		list.add(300);
		System.out.println("Before sorting:"+list);
		Collections.sort(list);
		System.out.println("After sorting:"+list);	
	}

}
