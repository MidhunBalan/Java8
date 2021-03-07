package com.lambda.collectionfrmwrk;

import java.util.TreeMap;

public class LambdaWithCollectionExample3 {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>((Obj1, Obj2) -> (Obj1 > Obj2) ? -1 : (Obj1 < Obj2) ? 1 : 0);
		treeMap.put(100, "Midhun");
		treeMap.put(600, "Sreesha");
		treeMap.put(300, "Nithin");
		treeMap.put(200, "Nisha");
		treeMap.put(150, "Suresh");
		System.out.println(treeMap);
	}
}
