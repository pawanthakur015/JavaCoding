/**
 * 
 */
package com.pawan.design.helper;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author pawankumarthakur
 * @param <K>
 * @param <V>
 *
 */
public class HashTableImpl<K, V> {

	private static class LinkedListNode<K, V> {

		public LinkedListNode<K, V> next;
		public LinkedListNode<K, V> prev;
		public K key;
		public V value;

		public LinkedListNode(K k, V v) {
			this.key = k;
			this.value = v;
		}
	}

	private ArrayList<LinkedListNode<K, V>> arr;

	public HashTableImpl(int c) {
		arr = new ArrayList<LinkedListNode<K, V>>();
	}

	public void put(K key, V value) {
		LinkedListNode<K, V> current = getNodeOfKey(key);
		if (current != null) {
			current.value = value;
			return;
		}
		int index = getIndex(key);
		LinkedListNode<K, V> node = new LinkedListNode<K, V>(key, value);
		if (arr.get(index) != null) {
			node.next = arr.get(index);
			node.next.prev = node;
		}
		arr.set(index, node);
	}

	public LinkedListNode<K, V> remove(K key) {
		LinkedListNode<K, V> current = getNodeOfKey(key);
		if (current != null) {
			if (current.prev != null) {
				current.prev.next = current.next;
			} else {
				int index = getIndex(key);
				arr.set(index, current.next);
			}

			if (current.next != null) {
				current.next.prev = current.prev;
			}
		}
		return current;
	}

	public V getKey(K key) {
		LinkedListNode<K, V> current = getNodeOfKey(key);
		return current == null ? null : current.value;
	}

	public LinkedListNode<K, V> getNodeOfKey(K key) {
		int index = getIndex(key);
		LinkedListNode<K, V> current = arr.get(index);
		while (Objects.nonNull(current)) {
			if (current.key == key) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	public int getIndex(K key) {
		return Math.abs(key.hashCode() % arr.size());
	}
}
