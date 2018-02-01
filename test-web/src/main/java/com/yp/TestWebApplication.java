package com.yp;

import com.yp.testservice.HelloService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = "com.yp.**")
@MapperScan(basePackages = "com.yp.testmapper")
public class TestWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestWebApplication.class, args);
	}

//	@Bean
//	public String nihao(){
//		System.out.println(HelloService.sayHello());
//		return "nihao";
//	}

	@PostConstruct
	public void nihao(){
		System.out.println(HelloService.sayHello());
	}
}
