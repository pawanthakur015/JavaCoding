/**
 * 
 */
package com.pawan.test;

import java.util.Arrays;

import com.pawan.test.constant.ParkingType;
import com.pawan.test.constant.Vehicle;

/**
 * @author pawankumarthakur
 *
 */
public class ProblemNo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ParkingSpace parkingSpace1 = new ParkingSpace(true, Vehicle.MOTORCYCLE, ParkingType.REGULAR);
		ParkingSpace parkingSpace2 = new ParkingSpace(true, Vehicle.MOTORCYCLE, ParkingType.REGULAR);
		ParkingSpace parkingSpace3 = new ParkingSpace(true, Vehicle.CAR, ParkingType.COMPACT);
		ParkingSpace parkingSpace4 = new ParkingSpace(true, Vehicle.CAR, ParkingType.COMPACT);
		
		ParkingLot parkingLot = new ParkingLot(4);
		parkingLot.getVacantParkingSpaces().addAll(Arrays.asList(parkingSpace1, parkingSpace2, parkingSpace3, parkingSpace4));
		parkingLot.parkVechile(ParkingType.COMPACT, Vehicle.CAR);
		parkingLot.parkVechile(ParkingType.REGULAR, Vehicle.MOTORCYCLE);
		parkingLot.parkVechile(ParkingType.COMPACT, Vehicle.CAR);
		parkingLot.parkVechile(ParkingType.REGULAR, Vehicle.MOTORCYCLE);
		parkingLot.parkVechile(ParkingType.COMPACT, Vehicle.CAR);
		
		parkingLot.releaseVechile(Vehicle.CAR);
	}

}
