package com.capgemini.hotelreservationsystemworkshop;

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
}
