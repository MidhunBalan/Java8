package com.twoargumentinterface;

import java.util.function.BiConsumer;

public class Example3 {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> c= (a, b) -> {
			System.out.println(a+b);
		};
		c.accept(1, 2);
	}
}
