package com.lambda;
/*
 * Multi-Thread using Lambda expression
 */
public class LambdaExample7 {
	public static void main(String arg[]) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}
