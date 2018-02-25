package com.maven.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@RequestMapping("/api/test")
public class Controller {
	  @RequestMapping("/satya")
	   public String home() {
	        return "Hello World!";
	    }
}
