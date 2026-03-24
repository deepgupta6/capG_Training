package com.example.orders.service;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.entity.OrderEntity;
import com.example.orders.exception.OrderNotFoundException;
import com.example.orders.mapper.OrderMapper;
import com.example.orders.repository.OrderRepository;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
	private final OrderRepository repo;
	
	public OrderServiceImpl(OrderRepository repo) {
		this.repo = repo;
	}

    @Override
    public OrderEntity createOrder(OrderRequestDTO request) {
        return repo.save(OrderMapper.toEntity(request));
        
    }

    @Override
    public OrderEntity getOrderById(Long id){
    	Optional<OrderEntity> op = repo.findById(id);
    	if(op.isPresent()) {
    		return op.get();
    	}
    	else throw new OrderNotFoundException();
    }

    @Override
    public void deleteOrder(Long id) {
        if(repo.existsById(id)==true) {
        	repo.deleteById(id);
        }
        else throw new OrderNotFoundException();
    }
}
