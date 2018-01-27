/**
 * 
 */
package com.pawan.design.sreviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.pawan.design.srevice.Observer;
import com.pawan.design.srevice.Subject;

/**
 * @author pawankumarthakur
 *
 */
public class MyTopic implements Subject {

	List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();

	public MyTopic() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		if (Objects.isNull(observer)) {
			throw new RuntimeException("observer is null");
		}
		synchronized (MUTEX) {
			if (!observers.contains(observer)) {
				observers.add(observer);
			}
		}
	}

	@Override
	public void unRegister(Observer observer) {
		if (Objects.isNull(observer)) {
			throw new RuntimeException("observer is null");
		}
		synchronized (MUTEX) {
			if (observers.contains(observer)) {
				observers.remove(observer);
			}
		}
	}

	@Override
	public void notifyObserver() {
		List<Observer> localObserver = null;
		synchronized (MUTEX) {
			if (!changed) {
				return;
			}
			localObserver = new ArrayList<>(observers);
			changed = false;
		}
		for (Observer observer : localObserver) {
			observer.update();
		}
	}

	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}

	public void postMessage(String message) {
		System.out.println("message is published on topic " + message);
		this.message = message;
		this.changed = true;
		notifyObserver();
	}
}
