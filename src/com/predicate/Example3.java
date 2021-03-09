package com.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Example3 {

	public static void main(String[] args) {
		Predicate<Collection> predicate = c-> c.isEmpty();
		ArrayList list1 = new ArrayList<>();
		System.out.println(predicate.test(list1));
		ArrayList list2 = new ArrayList<>();
		list2.add("hi");
		System.out.println(predicate.test(list2));
	}

}
