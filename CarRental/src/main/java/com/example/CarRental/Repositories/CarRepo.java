package com.example.CarRental.Repositories;

import com.example.CarRental.Enums.Category;
import com.example.CarRental.Models.Car;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car,Integer> {

		public List<Car> getCarByCategory(Category c);
		public List<Car> getCarByBrand(String b);
		
		//Write Methods
		
		//Car updateCar(int id);
		

}
