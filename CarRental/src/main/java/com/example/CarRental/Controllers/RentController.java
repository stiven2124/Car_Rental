package com.example.CarRental.Controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarRental.Models.Rent;
import com.example.CarRental.Servicies.RentService;

@RestController
@RequestMapping("/rents")
public class RentController {
	
	@Autowired
	private RentService rentService;
	
	@PostMapping
	public Rent addRent(@RequestParam int carId, @RequestParam int duration)
	{
		return rentService.addRent(carId, duration);
	}
	
}
