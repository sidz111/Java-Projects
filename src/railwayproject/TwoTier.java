package com.siddhu.day11.railwayproject;

public class TwoTier extends Railway {
	@Override
	void getSeatavailability(int seats) {
		System.out.println("==============YOU ARE IN TIER TWO==============");
		if (seats <= tier_two_seats) {
			System.out.println("Your Seat has been Booked in Tier Two");
			total_seats -= seats;
			tier_two_seats -= seats;
			System.out.println("Total " + total_seats + " seats are available");
			System.out.println("And " + tier_two_seats + " seats are available int Tier Two");
		} else {
			System.out.println("Sorry!!! only " + total_seats + " seats are available");
			System.out.println("And ony " + tier_two_seats + " seats are available in Tier Two");
		}
	}
}
