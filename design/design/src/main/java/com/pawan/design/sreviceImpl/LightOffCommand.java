/**
 * 
 */
package com.pawan.design.sreviceImpl;

import com.pawan.design.srevice.Command;

/**
 * @author pawankumarthakur
 *
 */
public class LightOffCommand implements Command{
	 private Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void excute() {
		light.switchOff();
	}

	@Override
	public void undo() {
		light.switchOn();
	}

	@Override
	public String toString() {
		return "LightOffCommand [light=" + light + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
