package com.ankesh.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ankesh.model.User;
import com.ankesh.repository.UserRepository;

public class UserService implements UserServiceInterface{
	@Autowired
	private UserRepository userrepo;
	@Override
	public String registerUser(User user) {
		userrepo.save(user);
		return "success";
	}

	@Override
	public long findcab() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String bookcab(long cabID) {
		// TODO Auto-generated method stub
		return null;
	}

}
