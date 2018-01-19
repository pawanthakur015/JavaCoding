package com.pawan.design.sreviceImpl;

import com.pawan.design.bean.CarType;
import com.pawan.design.srevice.Car;

public class SmallCar extends Car{

	public SmallCar() {
		super(CarType.SMALL);
		Construct();
	}

	@Override
	public void Construct() {
		
		System.out.println("implement small car");
	}

}
