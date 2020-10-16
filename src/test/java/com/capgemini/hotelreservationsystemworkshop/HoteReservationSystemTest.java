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
	public void testForcheapestHotelWithinADateRange() {
		Hotel firstHotel = new Hotel("Lakewood", 110, "10Sep2020", "11Sep2020");
		Hotel secondHotel = new Hotel("Bridgewood", 160, "10Sep2020", "11Sep2020");
		Hotel thirdHotel = new Hotel("Ridgewood", 220, "10Sep2020", "11Sep2020");
		HotelReservationMain hotelReservation = new HotelReservationMain();
		hotelReservation.addHotel(firstHotel);
		hotelReservation.addHotel(secondHotel);
		hotelReservation.addHotel(thirdHotel);
		System.out.println(hotelReservation.findMinimumPrice());
		String hotelName = hotelReservation.findTheCheapestHotel();
		System.out.println(hotelName);
		Assert.assertEquals("Lakewood", hotelName);
	}
}
