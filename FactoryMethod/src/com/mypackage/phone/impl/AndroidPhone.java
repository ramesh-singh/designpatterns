package com.mypackage.phone.impl;

import com.mypackage.phone.Phone;
import com.mypackage.specification.impl.AndroidCamera;
import com.mypackage.specification.impl.AndroidPanel;
import com.mypackage.specification.impl.AndroidProcessor;

public class AndroidPhone extends Phone {

	@Override
	public void createPhone() {
		specifications.add(new AndroidCamera());
		specifications.add(new AndroidPanel());
		specifications.add(new AndroidProcessor());
		
	}

}
