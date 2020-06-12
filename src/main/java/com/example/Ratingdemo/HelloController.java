package com.example.Ratingdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.apache.catalina.manager.DummyProxySession;
import org.springframework.http.HttpHeaders;


import java.util.List;

@RestController

public class HelloController {

	@GetMapping("/Hello")
	public String hello(@RequestHeader HttpHeaders headers) {		
		
		List<String>dummyKey= headers.get("user-agent"); 
		if(dummyKey !=null) {
		dummyKey.forEach(System.out::println);	}
		
		List<String>dummyKey1= headers.get("accept-language"); 
		if(dummyKey1 !=null) {
		dummyKey1.forEach(System.out::println);	}
		
		List<String>dummyKey2= headers.get("accept-encoding"); 
		if(dummyKey2 !=null) {
		dummyKey2.forEach(System.out::println);	}
		
		System.out.println("recieved request "+ Thread.currentThread().getId());
		return "HelloKeerthi";
	}
}
