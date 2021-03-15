package com.doublecolon;

interface InterfDoubleColon{
	public void m1();
}

public class Example1 {
	public static void m2() {
		System.out.println("implementation of method reference");
	}
	public static void main(String[] args) {
		InterfDoubleColon i= Example1::m2;
		i.m1();
	}

}
