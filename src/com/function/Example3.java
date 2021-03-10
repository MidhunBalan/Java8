package com.function;

import java.util.function.Function;

public class Example3 {

	public static void main(String[] args) {
		String stringWithSpace = "Midhun Balan, Chennai, Working as Software engineer";
		Function<String, String> f= s -> s.replaceAll(" ", "");
		System.out.println(f.apply(stringWithSpace));
		
		Function<String, Integer> lengthFinderWithSpace= s -> s.length();
		System.out.println("length with space"+lengthFinderWithSpace.apply(stringWithSpace));
		
		Function<String, Integer> lengthFinder= s -> s.replaceAll(" ", "").length();
		System.out.println("length without space"+lengthFinder.apply(stringWithSpace));
	}

}
