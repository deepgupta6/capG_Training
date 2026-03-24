package com.example.orders.controller;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.service.OrderService;

import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")

public class OrderController {
	private final OrderService service;
	
	public OrderController(OrderService service) {
		this.service=service;
	}

    @PostMapping
    public ResponseEntity<OrderResponseDTO> create(@Valid @RequestBody OrderRequestDTO request) {
    	return new ResponseEntity<OrderResponseDTO>(OrderMapper.toResponseDTO(service.createOrder(request)),HttpStatus.CREATED);
       
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDTO> getById(@PathVariable Long id) {
    	OrderEntity e = service.getOrderById(id);
    	if(e!=null) {
    		return new ResponseEntity<OrderResponseDTO>(OrderMapper.toResponseDTO(e),HttpStatus.OK);
    	}
    	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
    	service.deleteOrder(id);
    	return new ResponseEntity<String>("Order deleted successfully",HttpStatus.OK);
    }
}
