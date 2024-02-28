package com.example.dmeo.servies;

import com.example.dmeo.entity.Users;

public interface userServies {

	public String addUser(Users user);


	boolean emailExists(String email);


	public boolean validUser(String email, String password);


}
