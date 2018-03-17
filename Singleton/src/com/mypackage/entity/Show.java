package com.mypackage.entity;

import java.util.ArrayList;
import java.util.List;

public class Show {
	private List<String> availableSeats= null;
	private static volatile Show show= null;  //Lazy Loading
	                                          //volatile is used to make sure that no thread gets half initialized instance.
	
	
	private Show(){
		availableSeats= new ArrayList<>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	
	//Baisc Implementation of Singleton.
	/*public static Show getShowInstance(){
		if(show== null){
			show= new Show();
		}
		
		return show;
	}*/
	
	//Thread safe Singleton implementation using Syncronized block and double check locking.
	public static Show getShowInstance(){
		if(show== null){
			synchronized (Show.class) {
				if(show== null){
					show= new Show();
				}
			}
			
		}
		
		return show;
	}
	
	public boolean bookShow(String seat){
		return availableSeats.remove(seat);
	}

}
