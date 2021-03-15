package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		System.out.println(list);
		//find event numbers from the list using stream(filter example)
		List<Integer> eventList = list.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(eventList);
		
		//square each number from the list using stream(map example)
		List<Integer> doubleList = list.stream().map(I -> I * I).collect(Collectors.toList());
		System.out.println(doubleList);
	}
 
}
