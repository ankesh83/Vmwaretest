package com.ankesh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cab {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int carId;
	private String platenumer;
	private User owner;
	private Location location;
	private boolean isbooked;
	public Cab() {
		super();
	}
	public Cab(int carId, String platenumer, User owner, Location location, boolean isbooked) {
		super();
		this.carId = carId;
		this.platenumer = platenumer;
		this.owner = owner;
		this.location = location;
		this.isbooked = isbooked;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carId;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((platenumer == null) ? 0 : platenumer.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cab other = (Cab) obj;
		if (carId != other.carId)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (platenumer == null) {
			if (other.platenumer != null)
				return false;
		} else if (!platenumer.equals(other.platenumer))
			return false;
		return true;
	}
	
}
