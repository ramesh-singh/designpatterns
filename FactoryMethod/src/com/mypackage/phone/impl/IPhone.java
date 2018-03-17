package com.mypackage.phone.impl;

import com.mypackage.phone.Phone;
import com.mypackage.specification.impl.IPhoneCamera;
import com.mypackage.specification.impl.IPhonePanel;
import com.mypackage.specification.impl.IPhoneProcessor;

public class IPhone extends Phone{

	@Override
	public void createPhone() {
		specifications.add(new IPhoneCamera());
		specifications.add(new IPhonePanel());
		specifications.add(new IPhoneProcessor());
		
	}

}
