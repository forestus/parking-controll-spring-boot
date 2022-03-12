package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingControlApplication {


	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<String>  HelloWorld () {
		return ResponseEntity.ok("Hello World!");
	}

	@GetMapping("/status")
	public ResponseEntity<String>  serverStatus () {
		return ResponseEntity.ok("Server is On?");
	}

	@PostMapping
	public ResponseEntity<Object>  returnBody (HttpEntity<byte[]> requestEntity) {
		return ResponseEntity.ok(requestEntity.getBody());
	}
}
