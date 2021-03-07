package com.interfacee.defaultmethod;

interface Interf{
	default void m1() {
		System.out.println("default method is called from interface");
	}
}
public class Example1 implements Interf{

	public static void main(String[] args) {
		Example1 exm= new Example1();
		exm.m1();

	}

}
