/**
 * 
 */
package com.pawan.design.sreviceImpl;

import com.pawan.design.srevice.Command;

/**
 * @author pawankumarthakur
 *
 */
public class RemoteController {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.excute();
	}
	
	public void pressUndo() {
		command.undo();
	}

	@Override
	public String toString() {
		return "RemoteController [command=" + command + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
