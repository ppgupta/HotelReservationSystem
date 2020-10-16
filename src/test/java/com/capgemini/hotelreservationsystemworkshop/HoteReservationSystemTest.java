package com.capgemini.hotelreservationsystemworkshop;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.junit.Test;

import junit.framework.Assert;

public class HoteReservationSystemTest {

	@Test
	public void HotelAdded_methodShouldReturnTrue() {
		HotelReservationMain service = new HotelReservationMain();
		Hotel hotelCheck = new Hotel("Bridgewood", 160);
		boolean checkIfAdded = service.addHotel(hotelCheck);
		Assert.assertEquals(checkIfAdded, true);
	}
	
	@Test
	public void testForcheapestHotelWithinADateRange_AccoringToWeekdayCharges() {
		HotelReservationMain service = new HotelReservationMain();
		Hotel hotel1 = new Hotel("Lakewood", 110, 90);
		Hotel hotel2 = new Hotel("Bridgewood", 150, 50);
		Hotel hotel3 = new Hotel("Ridgewood", 220, 150);
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
		Hotel hotel = service.findCheapestHotel(start, end);

		Assert.assertEquals("Lakewood", hotel.getHotelName());
	}
}
