package Cab.Cab_Invoice_System;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Invoice_Main_Test {

	
	Invoice_Main invoice = null;

	@Before
	public void setUp() throws Exception {
		Invoice_Main Invoice_Main = new Invoice_Main();
	}
	
	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare() {
		double distance = 2.5;
		int time = 10;
		double fare = Invoice_Main.calculateFare(distance, time);
		Assert.assertEquals(35, fare, 0.0);
	}

	@Test
	public void givenLessDistanceAndTimeShouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = Invoice_Main.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}
}
