package com.example.orders.exception;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.orders.dto.OrderNotFoundDTO;
import com.example.orders.dto.ValidationErrorDTO;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(OrderNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public OrderNotFoundDTO handleException() {
		return new OrderNotFoundDTO(LocalDate.now(),"Order not found", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ValidationErrorDTO handleException1(MethodArgumentNotValidException e) {
		List<ObjectError> error = e.getBindingResult().getAllErrors();
		List<String> errors = new ArrayList<>();
		for(ObjectError o:error) {
			errors.add(o.getDefaultMessage());
		}
		
		return new ValidationErrorDTO(LocalDate.now(),errors);
	}
    
}
