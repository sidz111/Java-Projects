package com.siddhu.day11.railwayproject;

public class OneTier extends Railway {
	@Override
	void getSeatavailability(int seats) {
		System.out.println("==============YOU ARE IN TIER ONE==============");
		if (seats <= tier_one_seats) {
			System.out.println("Your Seat has been Booked in Tier One");
			total_seats -= seats;
			tier_one_seats -= seats;
			System.out.println("Total " + total_seats + " seats are available");
			System.out.println("And " + tier_one_seats + " seats are available int Tier One");
		} else {
			System.out.println("Sorry!!! only " + total_seats + " seats are available");
			System.out.println("And ony " + tier_one_seats + " seats are available in Tier One");
		}
	}
}
