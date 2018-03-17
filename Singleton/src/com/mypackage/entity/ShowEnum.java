package com.mypackage.entity;

import java.util.HashSet;
import java.util.Set;

/*
 * This is the Singleton implementation using Enum.
 */
public enum ShowEnum {
	INSTANCE;
	Set<String> availableSeats= null;
	
	private ShowEnum() {
		availableSeats= new HashSet<>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	
	public boolean bookShow(String seat){
		return availableSeats.remove(seat);
	}
}
