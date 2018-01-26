/**
 * 
 */
package com.pawan.design.sreviceImpl;

/**
 * @author pawankumarthakur
 *
 */
public class Light {
	
	private boolean on;
	
	public void switchOff() {
		this.on = false;
	}
	public void switchOn() {
		this.on = true;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	@Override
	public String toString() {
		return "Light [on=" + on + ", isOn()=" + isOn() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
