package com.pawan.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.pawan.test.constant.ParkingType;
import com.pawan.test.constant.Vehicle;


public class ParkingLot {

	private List<ParkingSpace> vacantParkingSpaces;
	private List<ParkingSpace> fullParkingSpaces;
	private int parkingSpaceCount ;
	private boolean isFull;
	private boolean isEmpty=true;

	public ParkingLot(int parkingSpaceCount) {
		this.vacantParkingSpaces = new ArrayList<ParkingSpace>();
		this.fullParkingSpaces = new ArrayList<ParkingSpace>();
		this.parkingSpaceCount = parkingSpaceCount;
	}
	
	private ParkingSpace findVacantSpace(ParkingType parkingType) {
		
		for(ParkingSpace parkingSpace : vacantParkingSpaces) {
			if(parkingSpace.getParkingType().equals(parkingType)) {
				return parkingSpace;
			}
		}
		return null;
	}
	
	public void parkVechile(ParkingType parkingType, Vehicle vehicle) {
		if(!isFull()) {
			ParkingSpace parkingSpace = findVacantSpace(parkingType);
			if(Objects.nonNull(parkingSpace)) {
				parkingSpace.setVacant(false);
				parkingSpace.setVehicle(vehicle);
				vacantParkingSpaces.remove(parkingSpace);
				fullParkingSpaces.add(parkingSpace);
				System.out.println("Park : vehicle type "+vehicle.name() + ", parking type "+ parkingType.name());
				if(fullParkingSpaces.size()==parkingSpaceCount) {
					isFull = true;
				}
				isEmpty = false;
			} else {
				System.out.println("parking space of park type : "+ parkingType.name() + " is not availlable ");
			}
		} else {
			System.out.println(" parking space is full ");
		}
	}
	
	public void releaseVechile(Vehicle vehicle) {
		ParkingSpace findParkingSpace = null ; 
		if(!isEmpty()) {
			for(ParkingSpace parkingSpace : fullParkingSpaces) {
				if(parkingSpace.getVehicle().equals(vehicle)) {
					findParkingSpace = parkingSpace;
				}
			}
		}
		if(Objects.nonNull(findParkingSpace)) {
			findParkingSpace.setVacant(true);
			findParkingSpace.setVehicle(null);
			fullParkingSpaces.remove(findParkingSpace);
			vacantParkingSpaces.add(findParkingSpace);
			System.out.println("Release Vechile : vehicle type "+vehicle.name() + ", parking type "+ findParkingSpace.getParkingType().name());
			if(vacantParkingSpaces.size()==parkingSpaceCount) {
				isEmpty = true;
			}
			isFull = false;
		} else {
			System.out.println("No vehicle type is park : " + vehicle.name());
		}
	}

	/**
	 * @return the parkingSpaceCount
	 */
	public int getParkingSpaceCount() {
		return parkingSpaceCount;
	}

	/**
	 * @return the isFull
	 */
	public boolean isFull() {
		return isFull;
	}

	/**
	 * @return the isEmpty
	 */
	public boolean isEmpty() {
		return isEmpty;
	}

	/**
	 * @param parkingSpaceCount the parkingSpaceCount to set
	 */
	public void setParkingSpaceCount(int parkingSpaceCount) {
		this.parkingSpaceCount = parkingSpaceCount;
	}

	/**
	 * @param isFull the isFull to set
	 */
	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	/**
	 * @param isEmpty the isEmpty to set
	 */
	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	/**
	 * @return the vacantParkingSpaces
	 */
	public List<ParkingSpace> getVacantParkingSpaces() {
		return vacantParkingSpaces;
	}

	/**
	 * @param vacantParkingSpaces the vacantParkingSpaces to set
	 */
	public void setVacantParkingSpaces(List<ParkingSpace> vacantParkingSpaces) {
		this.vacantParkingSpaces = vacantParkingSpaces;
	}
	
	public void addParkingSpace(ParkingSpace parkingSpace) {
		this.vacantParkingSpaces.add(parkingSpace);
	}
}
