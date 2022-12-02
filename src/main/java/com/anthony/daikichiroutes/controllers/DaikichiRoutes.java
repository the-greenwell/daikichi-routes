package com.anthony.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutes {
	@GetMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return String.format("Congratulations! You will soon travel to %s", city);
	}
	@GetMapping("/lotto/{seed}")
	public StringBuilder lotto(@PathVariable("seed") Integer seed) {
		StringBuilder sb = new StringBuilder();
		int check = seed % 2;
		if(check == 0) {
			sb.append("You will take a grand journey in the near future, but be wary of tempting offers");
		} else {
			sb.append("You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends");
		}
		return sb; 
	}
}
