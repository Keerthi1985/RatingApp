package com.example.Ratingdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.stream.Collectors;

@RestController

public class HelloController {

	@GetMapping("/Hello")
	public String hello(@RequestHeader MultiValueMap<String, String> headers) {		
	    
		System.out.println("Rating Hello Demo");
		
	    headers.forEach((key, value) -> {
	    	System.out.println(String.format(
	          "Rating Header '%s' = %s", key, value.stream().collect(Collectors.joining("|"))));
	    });
		
		/*List<String>dummyKey= headers.get("x-request-id"); 
		if(dummyKey !=null) {
			System.out.println("x-request-id");
			dummyKey.forEach(System.out::println);	}
		
		List<String>dummyKey1= headers.get("x-b3-traceid"); 
		if(dummyKey1 !=null) {
			System.out.println("x-b3-traceid");
			dummyKey1.forEach(System.out::println);	}
		
		List<String>dummyKey2= headers.get("x-b3-spanid"); 
		if(dummyKey2 !=null) {
			System.out.println("x-b3-spanid");
		dummyKey2.forEach(System.out::println);	}
		
		List<String>dummyKey3= headers.get("x-b3-sampled"); 
		if(dummyKey3 !=null) {
			System.out.println("x-b3-sampled");
		dummyKey3.forEach(System.out::println);	}
		
		List<String>dummyKey4= headers.get("x-b3-flags"); 
		if(dummyKey4 !=null) {
			System.out.println("x-b3-flags");
		dummyKey4.forEach(System.out::println);	}
		
		List<String>dummyKey5= headers.get("x-ot-span-context"); 
		if(dummyKey5 !=null) {
			System.out.println("x-ot-span-context");
		dummyKey5.forEach(System.out::println);	}
		
		List<String>dummyKey6= headers.get("x-datadog-trace-id"); 
		if(dummyKey6 !=null) {
			System.out.println("x-datadog-trace-id");
		dummyKey6.forEach(System.out::println);	}
		
		List<String>dummyKey7= headers.get("x-datadog-parent-id"); 
		if(dummyKey7 !=null) {
			System.out.println("x-datadog-parent-id");
		dummyKey7.forEach(System.out::println);	}
		
		List<String>dummyKey8= headers.get("x-datadog-sampled"); 
		if(dummyKey8 !=null) {
			System.out.println("x-datadog-sampled");
		dummyKey8.forEach(System.out::println);	}
		
		List<String>dummyKey9= headers.get("end-user"); 
		if(dummyKey9 !=null) {
			System.out.println("end-user");
		dummyKey9.forEach(System.out::println);	}
		
		List<String>dummyKey10= headers.get("user-agent"); 
		if(dummyKey10 !=null) {
			System.out.println("user-agent");
		dummyKey10.forEach(System.out::println);	}*/
		
		System.out.println("Rating recieved request "+ Thread.currentThread().getId());
		return "Hello Rating Headers";
	}
	
	@GetMapping("/HelloJager")
	public String checkJaeger() {
		
		System.out.println("entered checkJaeger");
		return "Hello Jaeger";
		
	}
	
	@GetMapping("/JagerChaining")
	public String chaining() {
		
		System.out.println("entered chaining");
		return "Hello Jaeger chaining";
		
	}
}
