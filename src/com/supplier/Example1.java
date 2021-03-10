package com.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Example1 {

	public static void main(String[] args) {
		Supplier<Date> s= () -> new Date();
		System.out.println(s.get());
	}

}
