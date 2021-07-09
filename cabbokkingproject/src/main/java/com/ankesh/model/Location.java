package com.ankesh.model;

public class Location {
	private int xcoord;
	private int ycoord;
	
	public Location() {
		super();
	}
	public Location(int xcoord, int ycoord) {
		super();
		this.xcoord = xcoord;
		this.ycoord = ycoord;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + xcoord;
		result = prime * result + ycoord;
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
		Location other = (Location) obj;
		if (xcoord != other.xcoord)
			return false;
		if (ycoord != other.ycoord)
			return false;
		return true;
	}

	
	
}
