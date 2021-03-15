package com.primitivetype.functionalinterface;

import java.util.function.IntPredicate;

public class Example1 {

	public static void main(String[] args) {
		IntPredicate p = i -> i%2==0;
		System.out.println(p.test(6));
	}

}
