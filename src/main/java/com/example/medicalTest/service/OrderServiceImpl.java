package com.example.medicalTest.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalTest.entity.Order;
import com.example.medicalTest.repository.OrderRepo;




@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderRepo or;
	@Override
	public Order addOrder(Order order) {
		
		return or.save(order);
	}

	@Override
	public List<Order> fetchAllOrder() {
		List<Order> allOrder = or.findAll();
		return allOrder;
		
	}

	@Override
	public Order getOrderById(int id) {
		Optional<Order> order = or.findById(id);

		if (order.isPresent()) {

			return order.get();
		}
		return null;
	}

	@Override
	public Order upadteOrderById(int id, Order order) {
		Optional<Order> o1 = or.findById(id);
		
		if (o1.isPresent()) {
			
			Order originalOrder = o1.get();
			
			 if (Objects.nonNull(order.getOrder_date())) {
				 originalOrder.setOrder_date(order.getOrder_date());
	            }
			 if (Objects.nonNull(order.getOrder_status()) && !"".equalsIgnoreCase(order.getOrder_status())) {
				 originalOrder.setOrder_status(order.getOrder_status());
	            }
			 
			
			 
			return or.save(originalOrder);
	            
			
		}
		return null;
	}

	@Override
	public String deleteOrderById(int id) {
		if(or.findById(id).isPresent()) {
			or.deleteById(id);
			
			return "user deleted successfully";
		}
		return "No such user in the database";
	}
	}
	
	
	

	

