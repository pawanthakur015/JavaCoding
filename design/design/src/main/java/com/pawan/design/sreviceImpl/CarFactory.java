package com.pawan.design.sreviceImpl;

import com.pawan.design.bean.CarType;
import com.pawan.design.srevice.Car;

public class CarFactory {
	
	public static Car buildCar(CarType model) {
		Car car = null;
		switch(model) {
		case SMALL : 
			 car = new SmallCar();
			 break;
		case LUXURY:
			car = new LuxuryCar();
			break;
		default:
			break;
		}
		return car;
	}
}
