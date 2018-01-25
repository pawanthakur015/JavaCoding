package com.pawan.design.sreviceImpl;

import com.pawan.design.srevice.HouseBuilder;

public class IglooHouseBuilder implements HouseBuilder {

	private House house;

	public IglooHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasement() {
		this.house.setBasement(" set basement ");
	}

	@Override
	public void buildStructure() {
		this.house.setStructure("set structure");
	}

	@Override
	public void buildRoof() {
		this.house.setRoof("set roof ");
	}

	@Override
	public void buildInterior() {
		this.house.setInterior("set interior ");
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
