package com.example.CarRental.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.CarRental.Enums.Role;
import com.example.CarRental.Models.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>
{
	public List<User> getByRole(Role role);
}
