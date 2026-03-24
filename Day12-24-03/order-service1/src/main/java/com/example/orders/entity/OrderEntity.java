package com.example.orders.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String customerName;
    @Email
    @NotNull
    private String email;
    @NotNull
    private String productName;
    @Min(value=1 , message = "quantity must be greater than 0")
    private Integer quantity;
    @NotNull
    @Min(1)
    private Double pricePerUnit;
    private Double totalAmount;
}
