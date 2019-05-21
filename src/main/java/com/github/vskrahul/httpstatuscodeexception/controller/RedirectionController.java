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
 * Exposing REST operations which will return HTTP code of series 3xx Redirection.
 * 
 * @author Rahul.Vishvakarma
 *
 */
@RestController
@RequestMapping("redirection")
public class RedirectionController {
	
	@RequestMapping(method={RequestMethod.GET}, path="303")
	public ResponseEntity<String> seeOther() {
		return new ResponseEntity<>("3xx_See Other", HttpStatus.SEE_OTHER);
	}
	
	@RequestMapping(method={RequestMethod.GET}, path="304")
	public ResponseEntity<String> continue100() {
		return new ResponseEntity<>("3xx_Not Modified", HttpStatus.NOT_MODIFIED);
	}
}