package com.capgemini.hotelreservationsystemworkshop;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class HotelReservationMain 
{
	private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public boolean addHotel(Hotel newHotel) {
		hotelList.add(newHotel);
		return true;
	}
	public int findMinimumPrice() {
		int minPrice = hotelList.get(0).calculatePrice();
		for (Hotel hotel : hotelList) {
			int price = hotel.calculatePrice();
			if (price < minPrice)
				minPrice = price;
		}
		return minPrice;
	}

	public String findTheCheapestHotel() {
		for (Hotel hotel : hotelList) {
			if (findMinimumPrice() == hotel.calculatePrice())
				return hotel.getHotelName();
		}
		return null;
	}
	
	
	 public  String display()
	    {  
	        String str1= "Welcome to hotel Reservation System" ;
	        return str1;
	    }
	 public static void main(String[]args) {
	    	HotelReservationMain hotelReservation=new HotelReservationMain();
	    	hotelReservation.display();
			Scanner sc = new Scanner(System.in);
			Hotel hotel1 = new Hotel("Lakewood", 110);
			Hotel hotel2 = new Hotel("Bridgewood", 160);
			Hotel hotel3 = new Hotel("Ridgewood", 220);
			hotelReservation.addHotel(hotel1);
			hotelReservation.addHotel(hotel2);
			hotelReservation.addHotel(hotel3);
			while (true) {
				System.out.println("Do you wish to add a new Hotel to the System?(y/n)");
				String choice = sc.nextLine();
				if (choice.equalsIgnoreCase("y")) {
					System.out.println("Enter the Name of the Hotel: ");
					String name = sc.nextLine();
					System.out.println("Enter the rates of the Hotel for a Regular Customer: ");
					int rates = Integer.parseInt(sc.nextLine());
					Hotel newHotel = new Hotel(name, rates);
					hotelReservation.addHotel(newHotel);
					System.out.println("Hotel " + name + " added to the Hotel Reservation");
				} else {
					System.out.println("Thankyou");
					break;
				}
			}
	    }
}
