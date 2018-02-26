/**
 * 
 */
package com.pawan.test;

import com.pawan.test.constant.ParkingType;
import com.pawan.test.constant.Vehicle;


/**
 * @author pawankumarthakur
 *
 */
public class ParkingSpace {

	private boolean isVacant;
	private Vehicle vehicle;
	private ParkingType parkingType;
	public ParkingSpace(boolean isVacant, Vehicle vehicle, ParkingType parkingType) {
		this.isVacant = isVacant;
		this.vehicle = vehicle;
		this.parkingType = parkingType;
	}
	/**
	 * @return the isVacant
	 */
	public boolean isVacant() {
		return isVacant;
	}
	/**
	 * @return the vehicle
	 */
	public Vehicle getVehicle() {
		return vehicle;
	}
	/**
	 * @return the parkingType
	 */
	public ParkingType getParkingType() {
		return parkingType;
	}
	/**
	 * @param isVacant the isVacant to set
	 */
	public void setVacant(boolean isVacant) {
		this.isVacant = isVacant;
	}
	/**
	 * @param vehicle the vehicle to set
	 */
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	/**
	 * @param parkingType the parkingType to set
	 */
	public void setParkingType(ParkingType parkingType) {
		this.parkingType = parkingType;
	}
	
}
