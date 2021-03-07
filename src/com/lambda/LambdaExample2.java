package com.lambda;

@FunctionalInterface
interface LExample2{
	public void method1();
}

public class LambdaExample2 {
	public static void main(String arg[]) {
		LExample2 lEx = () -> System.out.println("Hello Midhun");
		lEx.method1();
	}
}
