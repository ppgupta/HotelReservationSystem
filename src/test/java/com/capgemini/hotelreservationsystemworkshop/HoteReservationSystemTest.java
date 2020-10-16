package com.capgemini.hotelreservationsystemworkshop;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.junit.Test;

import junit.framework.Assert;

public class HoteReservationSystemTest {

	@Test
	public void HotelAdded_methodShouldReturnTrue() {
		HotelReservationMain service = new HotelReservationMain();
		Hotel hotelCheck = new Hotel("Bridgewood", 150, 50, 4.0);
		boolean checkIfAdded = service.addHotel(hotelCheck);
		Assert.assertEquals(checkIfAdded, true);
	}
	
	@Test
	public void testForcheapestHotelWithinADateRange_AccordingToWeekdayCharges() {
		HotelReservationMain service = new HotelReservationMain();
		Hotel hotel1 = new Hotel("Lakewood", 110, 90, 3.0);
		Hotel hotel2 = new Hotel("Bridgewood", 150, 50, 4.0);
		Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 5.0);
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
		long weekDays = service.countWeekDays(start, end);
		Hotel found = service.findCheapestHotel(start, end, weekDays);
		Assert.assertEquals("Lakewood", found.getHotelName());

	}
	@Test
	public void testForcheapestHotelWithinADateRange_AccordingToRating() {
		HotelReservationMain service = new HotelReservationMain();
		Hotel hotel1 = new Hotel("Lakewood", 110, 90, 3.0);
		Hotel hotel2 = new Hotel("Bridgewood", 150, 50, 4.0);
		Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 5.0);
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
		long weekDays = service.countWeekDays(start, end);
		Hotel found = service.findCheapestBestRatedHotel(start, end, weekDays);
		Assert.assertEquals("Bridgewood", found.getHotelName());

	}
	@Test
	public void testForBestRatedHotelWithinADateRange_AccordingToRating() {
		HotelReservationMain service = new HotelReservationMain();
		Hotel hotel1 = new Hotel("Lakewood", 110, 90, 3.0);
		Hotel hotel2 = new Hotel("Bridgewood", 150, 50, 4.0);
		Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 5.0);
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
		long weekDays = service.countWeekDays(start, end);
		Hotel hotel = service.findBestRatedHotel(start, end, weekDays);
		Assert.assertEquals("Ridgewood", hotel.getHotelName());
	}
}