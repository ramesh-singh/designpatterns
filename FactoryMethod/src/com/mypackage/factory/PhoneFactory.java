package com.mypackage.factory;

import com.mypackage.phone.Phone;
import com.mypackage.phone.PhoneType;
import com.mypackage.phone.impl.AndroidPhone;
import com.mypackage.phone.impl.IPhone;

public class PhoneFactory {
	
	public static Phone createPhone(PhoneType phoneType){
		
		switch(phoneType){
		
		case ANDROID: return new AndroidPhone();
		case IPHONE: return new IPhone();
		default: return null;
		}
	}

}
