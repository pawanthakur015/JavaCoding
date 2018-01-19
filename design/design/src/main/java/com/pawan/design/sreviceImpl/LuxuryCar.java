package com.pawan.design.sreviceImpl;

import com.pawan.design.bean.CarType;
import com.pawan.design.srevice.Car;

public class LuxuryCar extends Car{

	public LuxuryCar() {
		super(CarType.LUXURY);
		Construct();
	}

	@Override
	public void Construct() {
		System.out.println("implenent luxury car");
	}

}
