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
		
		System.out.println("Rating Demo");
		List<String>dummyKey= headers.get("user-agent"); 
		if(dummyKey !=null) {
		dummyKey.forEach(System.out::println);	}
		
		/*List<String>dummyKey1= headers.get("accept-language"); 
		if(dummyKey1 !=null) {
		dummyKey1.forEach(System.out::println);	}
		
		List<String>dummyKey2= headers.get("accept-encoding"); 
		if(dummyKey2 !=null) {
		dummyKey2.forEach(System.out::println);	}*/
		
		HttpClient client = new DefaultHttpClient();
		HttpGet get=null;
		Random objGenerator = new Random();
        for (int iCount = 0; iCount< 10; iCount++){
		  int num = objGenerator.nextInt(100);
		  if(num % 2 == 0) {
			  get = new HttpGet("http://dataservice3.default.svc.cluster.local:8083/Sample3Hello");
		  }else {
			  get = new HttpGet("http://dataservice4.default.svc.cluster.local:8084/Sample4Hello");
		  }
         }
	    
		try {
			client.execute(get);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("recieved request "+ Thread.currentThread().getId());
		return "HelloRating";
	}
}
