package com.mypackage.main;

import com.mypackage.entity.Show;
import com.mypackage.entity.ShowEnum;

public class MainApp {
	public static void main(String[] args) {
		/*Show show1= new Show();
		Show show2= new Show();
		
		//If show class is not Singleton then two instances can book same seat.
		System.out.println(show1.bookShow("1A"));
		System.out.println(show2.bookShow("1A"));*/
		
		Show show1= Show.getShowInstance();
		Show show2= Show.getShowInstance();
		
		//Singleton class will not allow same seat to be booked.
		System.out.println(show1.bookShow("1A"));
		System.out.println(show2.bookShow("1A"));
		
		//Calling Enum version of Singleton show
		
		ShowEnum show3= ShowEnum.INSTANCE;
		ShowEnum show4= ShowEnum.INSTANCE;
		
		System.out.println(show3.bookShow("1A"));
		System.out.println(show4.bookShow("1B"));
		System.out.println(show4.bookShow("1B"));
	}

}
