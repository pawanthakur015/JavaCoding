package com.pawan.design.srevice;

import com.pawan.design.bean.CarType;

public abstract class Car {
	
	private CarType model=null;
	
	public Car(CarType type) {
		model = type;
	}
	public abstract void Construct();
	
	public CarType getModel() {
		return model;
	}
	public void setModel(CarType model) {
		this.model = model;
	}
	
	
}
