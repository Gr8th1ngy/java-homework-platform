package com.air;

public class Flight {
	private int passenger;
	private int seat;
	public Flight(int passenger,int seat){
		this.passenger=passenger;
		this.seat=seat;
	}
	public void add1Passenger(){
		passenger++;
	}
	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
}
