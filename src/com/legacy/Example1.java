package com.legacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(5);
		list.add(200);
		list.add(110);
		list.add(300);
		System.out.println("Before sorting:"+list);
		Collections.sort(list);
		System.out.println("After sorting:"+list);	
		
		Collections.sort(list, new MayComparator());
		System.out.println("After custom sorting(Descending order):"+list);	
	}

}

class MayComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer ob1, Integer ob2) {
		if(ob1> ob2) {
			return -1;
		}else if(ob1< ob2) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
