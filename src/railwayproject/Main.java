package com.siddhu.day11.railwayproject;

import java.util.Scanner;

public abstract class Main extends Railway {
	public static void main(String[] args) {
		Railway r1 = new OneTier();
		Railway r2 = new TwoTier();
		Railway r3 = new ThreeTier();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("       \n\n1. Tier One\t\t2. Tier Two\t\t3. Tier Three\t\t4. Exit\n\n\n");
			System.out.print("In Which Tier Do you Want to Book Seat: ");
			int option = sc.nextInt();
//			if(option==4) 
//			{
//				System.out.println("Thank you for visiting Indian Railway!!!");
//				break;
//			}
//			System.out.print("How many Seats do you want to Book: ");
//			int seats = sc.nextInt();
			if (option > 5) {
				System.out.println("Invalid Option");
				System.exit(0);
			} else {
				System.out.print("How many Seats do you want to Book: ");
				int seats = sc.nextInt();
				switch (option) {
				case 1:
					r1.getSeatavailability(seats);
					break;
				case 2:
					r2.getSeatavailability(seats);
					break;
				case 3:
					r3.getSeatavailability(seats);
					break;
				case 4:
					System.out.println("Thank you for visiting to Indian Railway!!!");
					System.exit(0);
				default:
					System.out.println("Enter valid Option");
					System.exit(0);
				}
			}
		}
	}
}
