package com.example.CarRental.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarRental.Models.Rent;

@Repository
public interface RentRepo extends JpaRepository<Rent,Integer>{

}
