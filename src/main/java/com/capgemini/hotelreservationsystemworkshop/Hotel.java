package com.capgemini.hotelreservationsystemworkshop;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Hotel {
	private String hotelName;
	private int regularCustomerRate;
	private long totalRate;
	private int regularCustomerRateForWeekday;
	private int regularCustomerRateForWeekend;
	private double rating;

	// parameterized constructor
	
	public Hotel(String hotelName, int regularCustomerRateForWeekday, int regularCustomerRateForWeekend,double rating) {
		this.hotelName = hotelName;
		this.regularCustomerRateForWeekday = regularCustomerRateForWeekday;
		this.regularCustomerRateForWeekend = regularCustomerRateForWeekend;
		this.totalRate = 0;
		this.rating = rating;

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

	public void setTotalRate(long totalCostOfStay) {
		this.totalRate = totalCostOfStay;
	}
	public int getRegularCustomerRateForWeekday() {
		return regularCustomerRateForWeekday;
	}

	public void setRegularCustomerRateForWeekday(int rate) {
		this.regularCustomerRateForWeekday = rate;
	}

	public int getRegularCustomerRateForWeekend() {
		return regularCustomerRateForWeekend;
	}

	public void setRegularCustomerRateForWeekend(int rate) {
		this.regularCustomerRateForWeekend = rate;
	}
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "\nHotel Name: " + hotelName + "\nHotel rates for a regular customer (per day): " + regularCustomerRate
				+ "$\nTotal Cost of Stay: " + totalRate + "$ .";
	}
}
