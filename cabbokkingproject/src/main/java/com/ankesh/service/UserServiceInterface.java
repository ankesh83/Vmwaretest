package com.ankesh.service;

import com.ankesh.model.User;

public interface UserServiceInterface {
	public String registerUser(User user);
	public long findcab();
	public String bookcab(long cabID);
	
}
