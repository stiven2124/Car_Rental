package com.example.CarRental.Servicies;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CarRental.Dtos.UserDto;
import com.example.CarRental.Enums.Role;
import com.example.CarRental.Exceptions.UserNotFoundException;
import com.example.CarRental.Models.User;
import com.example.CarRental.Repositories.UserRepo;



@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public UserDto toDto(User user)
	{
		return new UserDto(user.getName(),user.getSurname(),user.getUsername(),user.getRole());
	}
	
	
	public List<UserDto> showUsers()
	{
		List <User> users =  userRepo.findAll();
		return users.stream().map(user -> toDto(user)).collect(Collectors.toList());
	}
	
	public UserDto getUserById(int id)
	{
		User u = userRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User with ID " + id + " not found"));
		return toDto(u);		
	}
	public List<UserDto> getUsersByRole(Role role)
	{
		List<User> users = userRepo.getByRole(role);
		return users.stream().map(user -> toDto(user)).collect(Collectors.toList());
	}
	
	public User addUser(User u)
	{
		return userRepo.save(u);
	}
	
	public void deleteUser(int id)
	{
		userRepo.deleteById(id);
	}

}

