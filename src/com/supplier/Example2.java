package com.supplier;

import java.util.function.Supplier;

public class Example2 {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String[] r1= {"Midhun", "Balan","Nithin", "Nisha","Sreesha"};
			int x = (int)(Math.random()*5);
			return r1[x];
		};
		System.out.println(s.get());
	}

}
