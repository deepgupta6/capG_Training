package com.example.orders.mapper;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;

public class OrderMapper {

    public static OrderEntity toEntity(OrderRequestDTO dto) {
        OrderEntity e = new OrderEntity();
        e.setCustomerName(dto.getCustomerName());
        e.setEmail(dto.getEmail());
        e.setProductName(dto.getProductName());
        e.setQuantity(dto.getQuantity());
        e.setPricePerUnit(dto.getPricePerUnit());
        e.setTotalAmount(dto.getPricePerUnit()*dto.getQuantity());
        
        return e;
    }

    public static OrderResponseDTO toResponseDTO(OrderEntity dto) {
        OrderResponseDTO e = new OrderResponseDTO();
        e.setOrderId(dto.getId());
        e.setCustomerName(dto.getCustomerName());
        e.setEmail(dto.getEmail());
        e.setProductName(dto.getProductName());
        e.setQuantity(dto.getQuantity());
        e.setPricePerUnit(dto.getPricePerUnit());
        e.setTotalAmount(dto.getTotalAmount());
        return e;
    }
}
