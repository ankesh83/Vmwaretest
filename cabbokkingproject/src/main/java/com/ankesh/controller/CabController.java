package com.ankesh.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ankesh.model.Cab;
import com.ankesh.model.User;
import com.ankesh.service.CabServiceInterface;
import com.ankesh.service.UserServiceInterface;

@RestController
@RequestMapping("/cab")
public class CabController {
	private CabServiceInterface cabservice;
	private UserServiceInterface userservice;
	@PostMapping("/register/{cabID}")
	public String registerforcabservice(@PathVariable("cabID") long cabid){
		String response = cabservice.addcabtoportal(cabid);
		return response;
	}
	@GetMapping("/book")
	public Long bookcab(){
		long cabid = userservice.findcab();
		return cabid;
	}
	@PostMapping("/add")
	public String addcab(@RequestParam Cab cab){
		return cabservice.registercab(cab);
	}
	@PostMapping("/register-user")
	public String registeruser(@RequestParam User user){
		return userservice.registerUser(user);
	}
	@PostMapping("/book/{cabId}")
	public String bookparticularcab(@PathVariable("cabId") long cabId){
		return userservice.bookcab(cabId);
	} 
	
}
 