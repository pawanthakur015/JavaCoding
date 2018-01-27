/**
 * 
 */
package com.pawan.design.sreviceImpl;

import java.util.Objects;

import com.pawan.design.srevice.Observer;
import com.pawan.design.srevice.Subject;

/**
 * @author pawankumarthakur
 *
 */
public class MyTopicSubscriber implements Observer {

	private String name;
	private Subject topic;

	public MyTopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic = sub;
	}

	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if (Objects.isNull(msg)) {
			System.out.println(name + "in this tpoic there is no message");
		} else {
			System.out.println(name + " in this topic message is " + msg);
		}
	}
}
