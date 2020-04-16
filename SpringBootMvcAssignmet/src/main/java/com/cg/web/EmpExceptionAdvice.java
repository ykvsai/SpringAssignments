package com.cg.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cg.entity.ErrorInfo;
import com.cg.exception.EmpIdException;
import com.cg.exception.EmpNotFoundException;

@ControllerAdvice
public class EmpExceptionAdvice {

	@ExceptionHandler(value = { EmpIdException.class })
	@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Id already exists")
	@ResponseBody
	public void handleException(Exception ex) {
		
	}
	
	@ExceptionHandler(value = { EmpNotFoundException.class })
	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Employee Not Found")
	@ResponseBody
	public void handleException2(Exception ex) {
		
	}
	
	@ExceptionHandler(value = { HttpMessageNotReadableException.class })
	@ResponseBody
	public ErrorInfo handle3Exception(Exception ex) {
		if(ex.getMessage().contains("doj"))
			return new ErrorInfo("Date must have the pattern yyyy-M-d");
		return new ErrorInfo(ex.getMessage());
	}
}
