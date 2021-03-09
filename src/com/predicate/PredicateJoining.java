package com.predicate;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		int[] x= {0, 5, 10, 15, 20, 25, 30};
		Predicate<Integer> p1 = i -> i>10;
		Predicate<Integer> p2 = i -> i%2==0;
		System.out.println("The number greater than 10 are");
		validationFunction(p1, x);
		System.out.println("Even numbers are");
		validationFunction(p2, x);
		System.out.println("Numbers not greater than 10 is");
		validationFunction(p1.negate(), x);
		System.out.println("The number greater than 10 and even are");
		validationFunction(p1.and(p2), x);
		System.out.println("The number greater than 10 or even are");
		validationFunction(p1.or(p2), x);
	}
	public static void validationFunction(Predicate<Integer> p, int[]x) {
		for(int x1: x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
	}

}
