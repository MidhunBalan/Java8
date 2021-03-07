package com.lambda.collectionfrmwrk;

import java.util.ArrayList;
import java.util.Collections;

public class SortingObjectWithLambda1 {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(100, "Midhun"));
		empList.add(new Employee(400, "Nithin"));
		empList.add(new Employee(300, "Nisha"));
		empList.add(new Employee(150, "MidhunBalan"));
		System.out.println(empList);
		Collections.sort(empList, (emp1, emp2) -> (emp1.eno > emp2.eno) ? -1 : (emp1.eno < emp2.eno) ? 1 : 0);
		System.out.println("After custom sort:" + empList);
	}

}

class Employee {
	int eno;
	String ename;

	Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public String toString() {
		return eno + "" + ename;
	}
}
