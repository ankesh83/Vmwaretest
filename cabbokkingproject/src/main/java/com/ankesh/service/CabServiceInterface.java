package com.ankesh.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ankesh.model.Cab;
import com.ankesh.repository.CabRepository;

public interface CabServiceInterface {
	
	public String registercab(Cab cab);
	public String addcabtoportal(long cabId);
}
