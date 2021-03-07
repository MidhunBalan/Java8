package com.interfacee.staticmethod;

interface StaticMethodExample1{
	public static void m1() {
		System.out.println("Interface static method is called");
	}
}

public class Example1 implements StaticMethodExample1{

	public static void main(String[] args) {
		
		StaticMethodExample1.m1();
	}

}
