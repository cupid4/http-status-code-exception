/**
 * 
 */
package com.github.vskrahul.httpstatuscodeexception.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * To Check if the spring-boot application is up and working fine.
 * 
 * @author Rahul.Vishvakarma
 *
 */
@RestController
public class WelcomeController {

	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}
}
