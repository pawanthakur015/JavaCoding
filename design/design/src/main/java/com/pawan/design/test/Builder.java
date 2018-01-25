/**
 * 
 */
package com.pawan.design.test;

import com.pawan.design.srevice.HouseBuilder;
import com.pawan.design.sreviceImpl.CivilEngineer;
import com.pawan.design.sreviceImpl.House;
import com.pawan.design.sreviceImpl.IglooHouseBuilder;

/**
 * @author pawankumarthakur
 *
 */
public class Builder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HouseBuilder houseBuilder = new IglooHouseBuilder();
		CivilEngineer civilEngineer = new CivilEngineer(houseBuilder);

		civilEngineer.constructBuilding();
		House house = civilEngineer.getHouse();
		System.out.println(house);
	}

}
