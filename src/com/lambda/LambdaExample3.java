package com.lambda;

interface AddInterface{
	public void add(int a, int b);
}
public class LambdaExample3 {
	public static void main(String arg[]) {
		AddInterface addInterface = (a, b) -> System.out.println("sum is:"+(a+b)); 
		addInterface.add(10, 20);
		addInterface.add(100, 500);
	}
}
