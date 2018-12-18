package com.openapi.esty.exception.handler;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openapi.esty.models.Error;
import com.openapi.esty.models.ErrorMessageResponse;

@ControllerAdvice
@Component
public class GlobalExceptionHandler {

	private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ResponseBody
	public ResponseEntity<ErrorMessageResponse> handle(Exception ex) {

		log.error("Exception: {}", ex);

		ErrorMessageResponse eMessageResponse = new ErrorMessageResponse();

		Error error = null;

		HttpStatus httpStatus = null;

		buildErrorObject(500, ex.getMessage(), null);
		eMessageResponse.setErrors(buildErrors(error));
		httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;

		return new ResponseEntity<ErrorMessageResponse>(eMessageResponse, httpStatus);
	}

	@ExceptionHandler({ MissingServletRequestParameterException.class })
	@ResponseBody
	public final ResponseEntity<ErrorMessageResponse> missingRequestParamException(
			MissingServletRequestParameterException ex) {

		log.error("Exception: {}", ex);

		ErrorMessageResponse eMessageResponse = new ErrorMessageResponse();

		List<Error> errors = new ArrayList<Error>();

		eMessageResponse.setErrors(errors);

		String paramName = ex.getParameterName();

		errors.add(buildErrorObject(400, String.format("Invalid or missing '%s' query parameter value", paramName),
				paramName));

		return new ResponseEntity<ErrorMessageResponse>(eMessageResponse, HttpStatus.BAD_REQUEST);
	}

	public static Error buildErrorObject(int code, String message, String details) {
		Error error = new Error();
		error.setCode(code);
		error.setMessage(message);
		error.setDetails(details);
		return error;
	}

	public static List<Error> buildErrors(Error error) {
		List<Error> errors = null;
		if (error != null) {
			errors = new ArrayList<>();
			errors.add(error);
		}
		return errors;
	}
}
