package com.learn.aop.demo_aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.aop.demo_aop.service.OrderService;

@RestController
@RequestMapping("/")
public class DemoAopController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public String welcomePage() {
		return "<html>"
				+ "<title>Welcome to aop demo page</title>"
				+ "<body>Welcome to aop demo page</body>"
				+ "</html>";
	}
	
	@GetMapping("checkOut")
	public void checkOutOrder(@RequestParam("orderId") String orderID) {
		orderService.processOrder(orderID);
	}
	
	@GetMapping("payment")
	public void processPaymentForOrder(@RequestParam("orderId") String orderID) {
		orderService.processPayment(orderID);
	}
	
	@GetMapping("shipment")
	public void processShipmentForOrder(@RequestParam("orderId") String orderID) {
		orderService.processOrderShipment(orderID);
	}
	
}
