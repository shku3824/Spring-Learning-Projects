package com.learn.aop.demo_aop.service;

import org.springframework.stereotype.Service;

import com.learn.aop.demo_aop.aspect.TrackExecutionTime;

@Service
public class OrderService {

	public void processOrder(String orderID) {
		System.out.println("Order Processed with Order id "+orderID);
	}
	
	public void processPayment(String orderID) {
		System.out.println("Order Payment Processed with Order id "+orderID);
	}
	
	@TrackExecutionTime
	public void processOrderShipment(String orderID) {
		System.out.println("Order Shipment Processed with Order id "+orderID);
	}
}
