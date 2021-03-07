package com.interfacee.defaultmethod;

interface InterfAmbigutyResolver1{
	default void m1() {
		System.out.println("InterfAmbigutyResolver1 is called from interface");
	}
}
interface InterfAmbigutyResolver2{
	default void m1() {
		System.out.println("InterfAmbigutyResolver2 is called from interface");
	}
}
public class Example3 implements InterfAmbigutyResolver1, InterfAmbigutyResolver2{
	
	public void m1() {
		InterfAmbigutyResolver1.super.m1();
	}
	public static void main(String[] args) {
		Example3 exm= new Example3();
		exm.m1();
	}

}
