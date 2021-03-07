package com.lambda.collectionfrmwrk;

import java.util.ArrayList;
import java.util.Collections;


/*
 * Program with comparator and lambda
 */
public class LambdaWithCollectionExample1 {
	public static void main(String arg[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(5);
		list.add(200);
		list.add(110);
		list.add(300);
		System.out.println("Before sorting:"+list);
		Collections.sort(list);
		System.out.println("After sorting:"+list);	
		
		Collections.sort(list, (Obj1, Obj2) -> (Obj1 > Obj2)?-1: (Obj1 < Obj2)? 1: 0 );
		System.out.println("After custom sorting(Descending order):"+list);	
	}

}
