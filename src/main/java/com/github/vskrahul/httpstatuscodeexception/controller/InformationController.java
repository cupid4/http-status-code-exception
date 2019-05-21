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
 * Exposing REST operations which will return HTTP code of series 1xx Informational.
 * 
 * @author Rahul.Vishvakarma
 *
 */
@RestController
@RequestMapping("informational")
public class InformationController {

	@RequestMapping(method={RequestMethod.GET}, path="100")
	public ResponseEntity<String> continue100() {
		return new ResponseEntity<>("1xx_Continue", HttpStatus.CONTINUE);
	}
	
	@RequestMapping(method={RequestMethod.GET}, path="101")
	public ResponseEntity<String> switchingProtocol() {
		return new ResponseEntity<>("1xx_Switching Protocols", HttpStatus.SWITCHING_PROTOCOLS);
	}
	
	@RequestMapping(method={RequestMethod.GET}, path="102")
	public ResponseEntity<String> prcessing() {
		return new ResponseEntity<>("1xx_Processing", HttpStatus.PROCESSING);
	}
}