package com.example.CarRental.Servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CarRental.Controllers.CarsController;
import com.example.CarRental.Models.Car;
import com.example.CarRental.Models.Rent;
import com.example.CarRental.Repositories.RentRepo;


@Service
public class RentService {
	
	@Autowired
	RentRepo rentRepo;
	@Autowired
	CarsController carController;
	
	
	public Rent addRent(int carId, int duration)
	{
		Car c = carController.GetCarById(carId);
		int total = c.getPrice() * duration;
		return rentRepo.save(new Rent(c,duration,total));
	}
}
