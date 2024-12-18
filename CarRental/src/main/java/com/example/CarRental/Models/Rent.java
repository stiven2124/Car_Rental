package com.example.CarRental.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Rent {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
	private Car car;
	private int duration;
	private int total;
	
	
	
	public Rent(Car car, int d, int total)
	{
		this.car = car;
		this.duration = d;
		this.total = total;
	}
	
	public Car getCar()
	{
		return car;
	}
	
	public int getId()
	{
		return Id;
	}

	public int getDuration()
	{
		return duration;
	}
	
	public int getTotal()
	{
		return total;
	}

	public void setId(int id)
	{
		Id = id;
	}

	public void setDuration(int duration)
	{
		this.duration = duration;
	}

	public void setTotal(int total)
	{
		this.total = total;
	}



	
}
