package com.pawan.design.sreviceImpl;

import com.pawan.design.srevice.HouseBuilder;

public class CivilEngineer {

	private HouseBuilder houseBuilder;

	public CivilEngineer(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void constructBuilding() {
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildStructure();
		this.houseBuilder.buildRoof();
		this.houseBuilder.buildInterior();
	}

	public House getHouse() {
		return this.houseBuilder.getHouse();
	}
}
