package Cab.Cab_Invoice_System;

import java.util.logging.Logger;

public class Invoice_Main {

	
	private static final double MINIMUM_COST_PER_KM = 10.0;
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_FARE = 5.0;
	
	
	public static void main (String[] args) {
		Logger Log = Logger.getLogger(Invoice_Main.class.getName());
		Log.info("Welcome to Cab Invoice Generation System");	
	}
	
	public static double calculateFare(double distance, int time) {
		double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
		return Math.max(totalFare, MINIMUM_FARE);
	}
	
}