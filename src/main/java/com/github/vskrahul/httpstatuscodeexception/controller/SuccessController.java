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
 * Exposing REST operations which will return HTTP code of series 2xx Success.
 * 
 * @author Rahul.Vishvakarma
 *
 */
@RestController
@RequestMapping("success")
public class SuccessController {

	@RequestMapping(method={RequestMethod.GET}, path="200")
	public ResponseEntity<String> ok() {
		return new ResponseEntity<>("2xx_Ok", HttpStatus.OK);
	}
	
	@RequestMapping(method={RequestMethod.GET}, path="202")
	public ResponseEntity<String> accepted() {
		return new ResponseEntity<>("2xx_Accepted", HttpStatus.ACCEPTED);
	}
}
