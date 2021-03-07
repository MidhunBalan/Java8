package com.lambda;

@FunctionalInterface
interface LengthFinder{
	public int getLength(String stringParam);
}

public class LambdaExample4 {

	public static void main(String[] args) {
		LengthFinder lengthFinder = (stringParam) -> stringParam.length();
		System.out.println(lengthFinder.getLength("Midhun"));
		System.out.println(lengthFinder.getLength("Amazon - Web"));
		System.out.println(lengthFinder.getLength("Google - app - engine"));
	}

}
