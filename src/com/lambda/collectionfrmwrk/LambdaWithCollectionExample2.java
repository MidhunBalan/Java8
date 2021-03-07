package com.lambda.collectionfrmwrk;

import java.util.TreeSet;

public class LambdaWithCollectionExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>((Obj1, Obj2) -> (Obj1 > Obj2) ? -1 : (Obj1 < Obj2) ? 1 : 0);
		treeSet.add(100);
		treeSet.add(5);
		treeSet.add(15);
		treeSet.add(300);
		System.out.println(treeSet);
	}
}
