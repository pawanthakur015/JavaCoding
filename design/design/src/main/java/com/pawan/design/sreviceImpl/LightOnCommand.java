/**
 * 
 */
package com.pawan.design.sreviceImpl;

import com.pawan.design.srevice.Command;

/**
 * @author pawankumarthakur
 *
 */
public class LightOnCommand implements Command{
	
	private Light light;
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void excute() {
		light.switchOn();
	}

	@Override
	public void undo() {
		light.switchOff();
	}

	@Override
	public String toString() {
		return "LightOnCommand [light=" + light + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
