package com.example.Ratingdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.apache.catalina.manager.DummyProxySession;
import org.apache.http.client.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.springframework.http.HttpHeaders;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;
import java.util.List;
import java.util.Random;

@RestController

public class HelloController {

	@GetMapping("/Hello")
	public String hello(@RequestHeader HttpHeaders headers) {		
		
		System.out.println("Rating Hello Demo");
		List<String>dummyKey= headers.get("x-request-id"); 
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
		dummyKey10.forEach(System.out::println);	}

		/*HttpGet get=null;
		Random objGenerator = new Random();
        for (int iCount = 0; iCount< 10; iCount++){
		  int num = objGenerator.nextInt(100);
		  if(num % 2 == 0) {
			  get = new HttpGet("http://dataservice3.default.svc.cluster.local:8083/Sample3Hello");
		  }else {
			  get = new HttpGet("http://dataservice4.default.svc.cluster.local:8084/Sample4Hello");
		  }
         }*/
		
		System.out.println("Rating recieved request "+ Thread.currentThread().getId());
		return "Hello Rating";
	}
}
