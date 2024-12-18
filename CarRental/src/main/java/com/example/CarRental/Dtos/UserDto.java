package com.example.CarRental.Dtos;

import com.example.CarRental.Enums.Role;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class UserDto {

	private String name;
	private String surname;
	private String username;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	public UserDto(String n, String s, String u, Role r)
	{
		this.name = n;
		this.surname = s;
		this.username = u;
		this.role = r;
	}

	public String getName()
	{
		return name;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public String getUsername()
	{
		return username;
	}
		
	
	public Role getRole()
	{
		return role;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	
	public void setRole(Role role)
	{
		this.role = role;
	}
}
