package com.example.sbkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SbkafkaApplication
{

	@RequestMapping("/")
	public String home()
	{
		System.out.println("aaa");
		return "Hello World: Springboot kafka app. " + Math.random();
	}

	@RequestMapping("/endpoint1")
	public String endpoint1()
	{
		System.out.println("bbb");
		return "Hello World at endpoint 1. Springboot kafka app. " + Math.random();
	}

	public static void main(String[] args) {
		SpringApplication.run(SbkafkaApplication.class, args);
	}

}
