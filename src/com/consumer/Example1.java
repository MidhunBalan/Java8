package com.consumer;

import java.util.function.Consumer;

public class Example1 {

	public static void main(String[] args) {
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("Midhun");
		consumer.accept("Balan");
	}
}
