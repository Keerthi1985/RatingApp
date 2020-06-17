package com.example.Ratingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.jaegertracing.Configuration;
import io.jaegertracing.internal.samplers.ProbabilisticSampler;
import io.opentracing.Tracer;

@SpringBootApplication
public class RatingdemoApplication {

	@Bean
	public io.opentracing.Tracer jagerTracer(){
		
		//return (Tracer) new Configuration("spring-boot").getTracer();
		
		 return (Tracer) new Configuration("spring-boot")
			        .getTracer();
		
		/*return new Configuration("spring-boot", 
				new Configuration.SamplerConfiguration(ProbabilisticSampler.TYPE,1]), new Configuration.ReporterConfiguration()).getTracer();*/
		
	}
	public static void main(String[] args) {
		SpringApplication.run(RatingdemoApplication.class, args);
	}

}
