package com.air;

public class MAIN {

	public static void main(String[] args) {
		Flight Vn233 = new Flight(0, 100);
		Vn233.add1Passenger();
		Vn233.add1Passenger();
		System.out.println(Vn233.getPassenger());
		Flight Vn234 = new Flight(0, 20);
		Vn233=Vn234;
		System.out.println(Vn233.getPassenger());
		System.out.println(Vn233.getSeat());
		Vn233.add1Passenger();
		System.out.println(Vn234.getPassenger());
	}

}
