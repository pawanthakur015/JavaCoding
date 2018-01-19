package com.pawan.design.test;

import com.pawan.design.bean.CarType;
import com.pawan.design.sreviceImpl.CarFactory;

public class TestFactoryPattern {
	
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
		System.out.println(CarFactory.buildCar(CarType.SMALL));
	}
}
