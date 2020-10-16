package com.capgemini.hotelreservationsystemworkshop;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.junit.Test;

import junit.framework.Assert;

public class HoteReservationSystemTest {

	@Test
	public void HotelAdded_methodShouldReturnTrue() {
		HotelReservationMain service = new HotelReservationMain();
		Hotel hotelCheck = new Hotel("Bridgewood", 150, 50, 110, 50, 4.0);
		boolean checkIfAdded = service.addHotel(hotelCheck);
		Assert.assertEquals(checkIfAdded, true);
	}

	// test for add a hotel
	// Adding the rates for reward customers

	@Test
	public void testForcheapestHotelWithinADateRange_AccoringToWeekdayCharges() {
		HotelReservationMain service = new HotelReservationMain();
		Hotel hotel1 = new Hotel("Lakewood", 110, 90, 80, 80, 3.0);
		Hotel hotel2 = new Hotel("Bridgewood", 150, 50, 110, 50, 4.0);
		Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 100, 40, 5.0);
		service.addHotel(hotel1);
		service.addHotel(hotel2);
		service.addHotel(hotel3);
		Date start = null;
		Date end = null;
		try {
			start = (Date) new SimpleDateFormat("ddMMMyyyy").parse("05Oct2020");
			end = (Date) new SimpleDateFormat("ddMMMyyyy").parse("09Oct2020");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	// test for cheapest hotel

	@Test
	public void testForcheapestHotelWithinADateRange_AccordingToRating() {
		HotelReservationMain service = new HotelReservationMain();
		Hotel hotel1 = new Hotel("Lakewood", 110, 90, 80, 80, 3.0);
		Hotel hotel2 = new Hotel("Bridgewood", 150, 50, 110, 50, 4.0);
		Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 100, 40, 5.0);
		service.addHotel(hotel1);
		service.addHotel(hotel2);
		service.addHotel(hotel3);
		Date start = null;
		Date end = null;
		try {
			start = (Date) new SimpleDateFormat("ddMMMyyyy").parse("11Sep2020");
			end = (Date) new SimpleDateFormat("ddMMMyyyy").parse("12Sep2020");
		} catch (Exception e) {
			System.out.println(e.getMessage());
    }
		
	}
	// test for finding cheapest hotel according to rating

	@Test
	public void testForBestHotelWithinADateRange_AccordingToRating() {
		HotelReservationMain service = new HotelReservationMain();
		Hotel hotel1 = new Hotel("Lakewood", 110, 90, 80, 80, 3.0);
		Hotel hotel2 = new Hotel("Bridgewood", 150, 50, 110, 0, 4.0);
		Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 100, 40, 5.0);
		service.addHotel(hotel1);
		service.addHotel(hotel2);
		service.addHotel(hotel3);
		Date start = null;
		Date end = null;
		try {
			start = (Date) new SimpleDateFormat("ddMMMyyyy").parse("11Sep2020");
			end = (Date) new SimpleDateFormat("ddMMMyyyy").parse("12Sep2020");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}