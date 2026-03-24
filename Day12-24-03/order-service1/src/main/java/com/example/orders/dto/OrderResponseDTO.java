package com.example.orders.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseDTO {
	
	private Long orderId;
	
	private String customerName;
	   
    private String email;
   
    private String productName;
    
    private Integer quantity;
   
    private Double pricePerUnit;
    private Double totalAmount;
}
