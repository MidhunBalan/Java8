package com.twoargumentinterface;

import java.util.function.BiFunction;

public class Example2 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f= (a, b)-> a+b;
		System.out.println(f.apply(10, 20));
		System.out.println(f.apply(10, 30));
		System.out.println(f.apply(10, 40));
	}

}
