package com.slk.FlightService.Exception.Utility;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.slk.FlightService.Exception.FlightNotFoundException;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	@ExceptionHandler(FlightNotFoundException.class)
	public ResponseEntity<ErrorInfo> exceptionHandler(FlightNotFoundException exp)
	{
    	ErrorInfo error = new ErrorInfo();
    	error.setErrorMessage("Flight not found!");
    	error.setErrorCode(HttpStatus.NOT_FOUND.value());
    	error.setTimeStamp(LocalDateTime.now());  	
		return new ResponseEntity<ErrorInfo> (error,HttpStatus.NOT_FOUND);		
	}

	

}
