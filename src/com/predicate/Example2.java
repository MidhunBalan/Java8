package com.predicate;

import java.util.function.Predicate;

public class Example2 {

	public static void main(String[] args) {
		Predicate<String> prd= Input -> Input.length() > 5;
		System.out.println(prd.test("Midhun"));
		System.out.println(prd.test("test"));
		System.out.println(prd.test("Sreesha"));

	}

}
