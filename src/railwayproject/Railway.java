package com.siddhu.day11.railwayproject;

public abstract class Railway {
	static {
		System.out.println("===========================WELCOME IN INDIAN RAILWAY===========================");
	}
	int tier_one_seats = 10;
	int tier_two_seats = 20;
	int tier_three_seats = 30;
	int total_seats = tier_one_seats + tier_two_seats + tier_three_seats;

	abstract void getSeatavailability(int seats);
}
