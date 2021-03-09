package com.predicate;

import java.util.function.Predicate;

public class Example5 {

	public static void main(String[] args) {
		String[] names = { "Midhun", "Nithin", "Nisha", "Sreesha" };

		Predicate<String> startWithS = s -> s.charAt(0) == 'S';
		for (String s : names) {
			if (startWithS.test(s)) {
				System.out.println("Matching string is ::  " + s);
			}
		}

	}

}
