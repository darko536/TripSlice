package com.Darko.TripSlice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
//@RequestMapping("api/v1/users")
public class TripSliceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripSliceApplication.class, args);
	}

	@GetMapping("/greet")
	public String greet(){
		return "Nicole Stinks";
	}

}
