package com.lambda;

@FunctionalInterface
interface SquareItInteface{
	public int SquareIt(int x);
}

public class LambdaExample6 {
	public static void main(String arg[]) {
		SquareItInteface squareItInterface = x -> x*x;
		System.out.println(squareItInterface.SquareIt(5));
		System.out.println(squareItInterface.SquareIt(6));
		System.out.println(squareItInterface.SquareIt(7));
	}

}
