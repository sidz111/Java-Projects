package com.siddhu.day11.railwayproject;

public class ThreeTier extends Railway {
	@Override
	void getSeatavailability(int seats) {
		System.out.println("==============YOU ARE IN TIER THREE==============");
		if (seats <= tier_three_seats) {
			System.out.println("Your Seat has been Booked in Tier Three");
			total_seats -= seats;
			tier_three_seats -= seats;
			System.out.println("Total " + total_seats + " seats are available");
			System.out.println("And " + tier_three_seats + " seats are available int Tier Three");
		} else {
			System.out.println("Sorry!!! only " + total_seats + " seats are available");
			System.out.println("And ony " + tier_three_seats + " seats are available in Tier Three");

		}
	}
}
