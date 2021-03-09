package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Example3 {

	public static void main(String[] args) {
		Predicate<ArrayList<String>> predicate = c-> c.isEmpty();
		ArrayList<String> list1 = new ArrayList<>();
		System.out.println(predicate.test(list1));
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("hi");
		System.out.println(predicate.test(list2));
	}

}
