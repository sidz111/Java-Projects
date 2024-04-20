package com.siddhu.day20.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=====================================================================");
			System.out.println("1.Add Emp\t\t2.Sort by Id\t\t3.Sort by Name\n\n4.Sort by Salary\t\t5.Exit");
			System.out.println("=====================================================================\n");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.print("Enter id: ");
				int id = sc.nextInt();
				System.out.print("Enter name: ");
				String name = sc.next();
				System.out.print("Enter Salary: ");
				double salary = sc.nextDouble();
				al.add(new Emp(id, name, salary));
				System.out.println("\t\t\t\t...." + name + " added in database....");
				break;
			case 2:
				System.out.print("=======Sorting by Id=======");
				Collections.sort(al, new IdComparator());
				System.out.println(al);
				break;

			case 3:
				System.out.print("=======Sorting by Name=======");
				Collections.sort(al, new NameComparator());
				System.out.println(al);
				break;

			case 4:
				System.out.print("=======Sorting by Name=======");
				Collections.sort(al, new SalaryComparator());
				System.out.println(al);
				break;

			case 5:
				System.out.println("=========Thank you=========");
				System.exit(0);
			}
		}
	}
}
