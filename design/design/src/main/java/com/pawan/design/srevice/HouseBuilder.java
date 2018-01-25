/**
 * 
 */
package com.pawan.design.srevice;

import com.pawan.design.sreviceImpl.House;

/**
 * @author pawankumarthakur
 *
 */
public interface HouseBuilder {

	public void buildBasement();

	public void buildStructure();

	public void buildRoof();

	public void buildInterior();

	public House getHouse();
}
