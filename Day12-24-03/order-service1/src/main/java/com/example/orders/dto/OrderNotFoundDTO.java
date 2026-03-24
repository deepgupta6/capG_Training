package com.example.orders.dto;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderNotFoundDTO {
	private LocalDate timestamp;
	private String message;
	private HttpStatus status;
}
