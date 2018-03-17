package com.mypackage.phone;

import java.util.ArrayList;
import java.util.List;

import com.mypackage.specification.Specification;

public abstract class Phone {
	protected List<Specification> specifications= new ArrayList<Specification>();
	
	public Phone(){
		createPhone();
	}
	
	public abstract void createPhone();

}
