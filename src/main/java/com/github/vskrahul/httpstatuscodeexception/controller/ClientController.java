/**
 * 
 */
package com.github.vskrahul.httpstatuscodeexception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Exposing REST operations which will return HTTP code of series 4xx Client Error.
 * 
 * @author Rahul.Vishvakarma
 *
 */
@RestController
@RequestMapping("client-error")
public class ClientController {

	@RequestMapping(method={RequestMethod.GET}, path="400")
	public ResponseEntity<String> seeOther() {
		return new ResponseEntity<>("4xx_Bad Request", HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(method={RequestMethod.GET}, path="402")
	public ResponseEntity<String> continue100() {
		return new ResponseEntity<>("4xx_Payment Required", HttpStatus.PAYMENT_REQUIRED);
	}
}
