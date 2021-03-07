package com.interfacee.defaultmethod;

interface InterfNew{
	default void m1() {
		System.out.println("default method is called from interface");
	}
}
public class Example2 implements InterfNew{
	
	public void m1(){
		System.out.println("running implemented method");
	}

	public static void main(String[] args) {
		Example2 exm= new Example2();
		exm.m1();

	}

}
