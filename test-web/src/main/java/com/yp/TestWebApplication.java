package com.yp;

import com.yp.testservice.HelloService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = "com.yp.**")
@MapperScan(basePackages = "com.yp.testmapper")
public class TestWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestWebApplication.class, args);
//		System.exit(SpringApplication
//				.exit(SpringApplication.run(TestWebApplication.class, args)));
	}

//	@Bean
//	public ExitCodeGenerator exitCodeGenerator() {
//		return () -> 42;
//	}
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
