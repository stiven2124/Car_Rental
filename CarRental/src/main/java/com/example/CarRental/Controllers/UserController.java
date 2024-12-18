package com.example.CarRental.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CarRental.Dtos.UserDto;
import com.example.CarRental.Enums.Role;
import com.example.CarRental.Models.User;
import com.example.CarRental.Servicies.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
		
	@GetMapping()
	public List<UserDto> showUsers()
	{
			return userService.showUsers();
	}
		
	@GetMapping("/{id}")
	public UserDto GetUserById(@PathVariable int id)
	{
		return userService.getUserById(id);
		
	}
	
	@GetMapping("/Role/{role}")
	public List<UserDto> GetUsersByRole(@PathVariable Role role)
	{
		return userService.getUsersByRole(role);
	}
		
	@PostMapping
	public User addUser(@RequestBody User u)
	{
		return userService.addUser(u);
	}
		
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id)
	{
		userService.deleteUser(id);
	}
	
}
