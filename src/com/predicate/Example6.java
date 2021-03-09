package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Example6 {

	public static void main(String[] args) {

		String[] names = { "Midhun", " ", null, "Nithin", "Vanaja", null, "Sreesha" };
		Predicate<String> p = s -> s != null && s.length() != 0;
		ArrayList<String> list = new ArrayList<>();

		for (String s : names) {
			if (p.test(s)) {
				list.add(s);
			}
		}
		System.out.println(list);
	}

}
