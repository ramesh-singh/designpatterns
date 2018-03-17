package com.mypackage.main;

import com.mypackage.factory.PhoneFactory;
import com.mypackage.phone.Phone;
import com.mypackage.phone.PhoneType;

public class MainApp {
	public static void main(String[] args) {
		Phone androidPhone= PhoneFactory.createPhone(PhoneType.ANDROID);
		System.out.println(androidPhone);
		
		Phone iPhone= PhoneFactory.createPhone(PhoneType.IPHONE);
		System.out.println(iPhone);
	}

}
