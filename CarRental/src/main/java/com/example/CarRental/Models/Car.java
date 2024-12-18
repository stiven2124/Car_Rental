package com.example.CarRental.Models;

import com.example.CarRental.Enums.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Cars")  
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private String model;
	private int year;
	private int price;
	@Enumerated(EnumType.STRING)
	private Category category;
		
		
	public Car() {};
		
	//Getters
	public String getBrand()
	{
		return brand;
	}
		
	public String getModel() 
	{
		return model;
	}
		
	public int getYear()
	{
		return year;
	}
		
	public int getPrice()
	{
		return price;
	}
		
	public Category getCategory()
	{
		return category;
	}
		
	//Setters
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
		
	public void setModel(String m)
	{
		this.model = m ;
	}
		
	public void setYear(int y)
	{
		this.year = y;
	}
		
	public void setPrice(int p)
	{
		this.price = p ;
	}
		
	public void setCategory(Category c)
	{
		this.category = c;
	}
}
