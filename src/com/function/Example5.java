package com.function;

import java.util.function.Function;

public class Example5 {

	public static void main(String[] args) {
		Function<String, String> f1= s -> s.toUpperCase();
		Function<String, String> f2= s -> s.substring(0, 9);
		System.out.println(f1.apply("midhunbalanmca"));
		System.out.println(f2.apply("midhunbalanmca"));
		System.out.println(f1.andThen(f2).apply("midhunbalanmca"));
		System.out.println(f1.compose(f2).apply("midhunbalanmca"));
	}

}
