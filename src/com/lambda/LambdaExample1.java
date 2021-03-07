package com.lambda;

interface Interf {
	public void sum(int a, int b);
}

public class LambdaExample1 {
	public static void main(String arg[]) {
		Interf i = (a,b) -> System.out.println("The Sum:" +(a+b));
		i.sum(5,10);
	}
}
