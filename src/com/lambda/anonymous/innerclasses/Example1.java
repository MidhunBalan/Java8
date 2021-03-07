package com.lambda.anonymous.innerclasses;

public class Example1 {

	public static void main(String[] args) {
		Runnable r = () ->{
			for(int i=0; i< 10; i++) {
				System.out.println("child thread");
			}
		};
		Thread thread = new Thread(r);
		thread.start();
		for(int i=0; i< 10; i++) {
			System.out.println("main thread");
		}

	}

}
