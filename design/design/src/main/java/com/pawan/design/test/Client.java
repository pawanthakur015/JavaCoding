/**
 * 
 */
package com.pawan.design.test;

import com.pawan.design.sreviceImpl.Light;
import com.pawan.design.sreviceImpl.LightOffCommand;
import com.pawan.design.sreviceImpl.LightOnCommand;
import com.pawan.design.sreviceImpl.RemoteController;

/**
 * @author pawankumarthakur
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Light light = new Light();
		LightOnCommand onCommand = new LightOnCommand(light);
		LightOffCommand offCommand = new LightOffCommand(light);
		
		RemoteController remoteController = new RemoteController();
		remoteController.setCommand(onCommand);
		remoteController.pressButton();
		System.out.println(remoteController);
		
		remoteController.setCommand(offCommand);
		remoteController.pressButton();
		System.out.println(remoteController);
		
	}

}
