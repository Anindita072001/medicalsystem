package com.example.medicalTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicalTest.entity.Order;

import com.example.medicalTest.service.OrderService;



@RestController
public class OrderController {
	@Autowired
OrderService os;

@PostMapping("/addOrder")
public Order addOrder(@RequestBody Order order) {
	
	return os.addOrder(order);
}


 @GetMapping("/getOrder")
    public List<Order> getAllOrder() {
	 	return os.fetchAllOrder();
       
    }
  
  @GetMapping("/getOrder/{id}") //localhost:8080/getPatient/5
  public Order getOrderById(@PathVariable("id")int id)
  {
	  return os.getOrderById(id);
	  
  }
  
  @PutMapping("/Order/{id}")
    public Order updateOrder(@PathVariable("id") int id, @RequestBody Order order) {
	  return os.upadteOrderById(id, order);
        
    }
  
  @DeleteMapping("/Order/{id}")
  public String deleteOrder(@PathVariable("id") int id) {
	  return os.deleteOrderById(id);
	  
  }
}
