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
 * Exposing REST operations which will return HTTP code of series 5xx Server Error.
 * 
 * @author Rahul.Vishvakarma
 *
 */
@RestController
@RequestMapping("server-error")
public class ServerErrorController {

	@RequestMapping(method={RequestMethod.GET}, path="500")
	public ResponseEntity<String> seeOther() {
		return new ResponseEntity<>("5xx_Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@RequestMapping(method={RequestMethod.GET}, path="502")
	public ResponseEntity<String> continue100() {
		return new ResponseEntity<>("5xx_Bad Gateway", HttpStatus.BAD_GATEWAY);
	}
}
