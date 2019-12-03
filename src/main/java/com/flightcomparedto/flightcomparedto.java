package com.flightcomparedto;

public class flightcomparedto {

	private String from;
	private String to;
	private String Date;
	private String Airline;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getAirline() {
		return Airline;
	}

	public void setAirline(String airline) {
		Airline = airline;
	}

	@Override
	public String toString() {
		return "flightcomparedto [from=" + from + ", to=" + to + ", Date=" + Date + ", Airline=" + Airline + "]";
	}

}
