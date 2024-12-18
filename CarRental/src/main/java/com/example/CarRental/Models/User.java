package com.example.CarRental.Models;

import com.example.CarRental.Enums.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Users") 
public class User {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private String username;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	
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
		
	public String getPassword()
	{
		return password;
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
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setRole(Role role)
	{
		this.role = role;
	}
	
	
		
	

}
