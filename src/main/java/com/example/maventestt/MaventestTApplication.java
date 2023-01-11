package com.example.maventestt;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MaventestTApplication {

	@RequestMapping("/")
	String home() {
		return "springboot_test";
	}

	public static void main(String[] args) {
		SpringApplication.run(MaventestTApplication.class, args);
	}

}