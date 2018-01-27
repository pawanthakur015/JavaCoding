/**
 * 
 */
package com.pawan.design.test;

import com.pawan.design.srevice.Observer;
import com.pawan.design.sreviceImpl.MyTopic;
import com.pawan.design.sreviceImpl.MyTopicSubscriber;

/**
 * @author pawankumarthakur
 *
 */
public class ObserverPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyTopic myTopic = new MyTopic();

		Observer observer1 = new MyTopicSubscriber("obj1");
		Observer observer2 = new MyTopicSubscriber("obj2");
		Observer observer3 = new MyTopicSubscriber("obj3");

		myTopic.register(observer1);
		myTopic.register(observer2);
		myTopic.register(observer3);

		observer1.setSubject(myTopic);
		observer2.setSubject(myTopic);
		observer3.setSubject(myTopic);

		observer1.update();

		myTopic.postMessage("---New Message---");
		observer1.update();

	}

}
