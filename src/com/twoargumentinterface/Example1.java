package com.twoargumentinterface;

import java.util.function.BiPredicate;

public class Example1 {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p = (a, b) -> (a+b)%2==0;
		System.out.println(p.test(2, 4));
		System.out.println(p.test(2, 5));
	}

}
