package Cab.Cab_Invoice_System;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Invoice_Main_Test {

	
	Invoice_Main invoiceGenerator = null;

	@Before
	public void setUp() throws Exception {
		invoiceGenerator = new Invoice_Main();
	}
	
	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare() {
		double distance = 2.5;
		int time = 10;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(35, fare, 0.0);
	}

	@Test
	public void givenLessDistanceAndTimeShouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}
	
	@Test
	public void givenMultipleRidesShouldReturnInvoiceSummary() {
		int userId = 123;
		Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
		Invoice_Main cabInvoiceGenerator = new Invoice_Main(userId, rides);
		InvoiceSummary actualInvoiceSummary = cabInvoiceGenerator.calculateFare(userId);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
		Assert.assertEquals(expectedInvoiceSummary, actualInvoiceSummary);
	}

	
}
