package com.capgemini.hotelreservationsystemworkshop;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Hotel {
	private String hotelName;
	private int regularCustomerRate;
	private int totalRate;
	private String startDate, endDate;

	// parameterized constructor
	public Hotel(String hotelName, int regularCustomerRate) {
		this.hotelName = hotelName;
		this.regularCustomerRate = regularCustomerRate;
	}
	public Hotel(String hotelName, int rate, String startDate, String endDate) {
		this.hotelName = hotelName;
		this.totalRate = rate;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	// getters and setters
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRegularCustomerRate() {
		return regularCustomerRate;
	}

	public void setRegularCustomerRate(int rate) {
		this.regularCustomerRate = rate;
	}
	public long getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(int rate) {
		this.totalRate = rate;
	}
	
	
	@Override
	public String toString() {
		return "\nHotel Name: " + hotelName + "\nHotel rates for a regular customer (per day): " + regularCustomerRate
				+ "$\nTotal Cost of Stay: " + totalRate + "$ .";
	}
}
