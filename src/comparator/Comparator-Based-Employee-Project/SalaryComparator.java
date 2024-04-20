package com.siddhu.day20.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return (int) (o1.getSalary() - o2.getSalary());
	}

}
