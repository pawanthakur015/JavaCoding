/**
 * 
 */
package com.pawan.design.srevice;

/**
 * @author pawankumarthakur
 *
 */
public interface Subject {
	
	//---Register Observer and UnRegister Observer.
	public void register(Observer observer);
	public void unRegister(Observer observer);
	
	public void notifyObserver();
	public Object getUpdate(Observer observer);
	
}
