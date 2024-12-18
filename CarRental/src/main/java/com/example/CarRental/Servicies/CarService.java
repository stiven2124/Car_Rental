package com.example.CarRental.Servicies;
import com.example.CarRental.Repositories.CarRepo;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.CarRental.Enums.Category;
import com.example.CarRental.Models.Car;

@Service
public class CarService {
	
	@Autowired
	private CarRepo carRepo;
	
	
	public List<Car> showCars()
	{
		return carRepo.findAll();
	}
	
	public Car getCarById(int id)
	{
		try {			
		return carRepo.findById(id).get();
		} 
		catch (EntityNotFoundException ex) {
			throw new EntityNotFoundException("Car Not Found");
		}
	}
	
	public List<Car> getCarByBrand(String b)
	{
		return carRepo.getCarByBrand(b);
	}
	
	public List<Car> getCarByCategory(Category c)
	{
		return carRepo.getCarByCategory(c);
	}
	
	public Car addCar(Car c)
	{
		return carRepo.save(c);
	}
	
	public void deleteCar(int id)
	{
		carRepo.deleteById(id);
	}

}
