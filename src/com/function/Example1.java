package com.function;

import java.util.function.Function;

public class Example1 {

	public static void main(String[] args) {
		Function<String, Integer> f= s -> s.length();
		System.out.println(f.apply("MidhunBalan"));
		System.out.println(f.apply("SreeshaCK"));
	}

}
