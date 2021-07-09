package com.ankesh.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ankesh.model.Cab;
import com.ankesh.repository.CabRepository;

public class CabService implements CabServiceInterface{
	@Autowired
	private CabRepository cabrepo;
	@Override
	public String registercab(Cab cab) {
		cabrepo.save(cab);
		return "success";
	}

	@Override
	public String addcabtoportal(long cabId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
