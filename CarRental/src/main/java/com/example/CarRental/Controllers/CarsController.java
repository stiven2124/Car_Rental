package com.example.CarRental.Controllers;

import com.example.CarRental.Servicies.CarService;
import com.example.CarRental.Enums.Category;
import com.example.CarRental.Models.Car;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/cars")
public class CarsController {
	@Autowired
	CarService carService;
	
	@GetMapping
	public List<Car> showAllCars()
	{
		return carService.showCars();
	}
	
	@GetMapping("/{id}")
	public Car GetCarById(@PathVariable int id)
	{
		return carService.getCarById(id);
	}
	
	@GetMapping("/brand/{brand}")
	public List<Car> getCarByBrand(@PathVariable("brand") String brand)
	{
		return carService.getCarByBrand(brand);
	}
	
	@GetMapping("/category/{category}")
	public List<Car> getCarByCategory(@PathVariable Category category)
	{
		return carService.getCarByCategory(category);
	}
	
	@PostMapping
	public Car addCar(@RequestBody Car c)
	{
		return carService.addCar(c);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCar(@PathVariable int id)
	{
		carService.deleteCar(id);
	}
	
	
	
}
