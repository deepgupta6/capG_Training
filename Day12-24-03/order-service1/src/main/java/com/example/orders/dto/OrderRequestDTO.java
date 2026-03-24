package com.example.orders.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDTO {
	
	private Long orderId;
	@NotNull
    @Size(min=3, message="customerName must not be blank")
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
    
}
