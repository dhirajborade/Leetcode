/**
 *
 */
package com.Amazon.Medium;

import java.util.HashMap;
import java.util.Random;

/**
 * @author dhirajborade
 *
 */
public class RandomizedSet {

	private HashMap<Integer, Integer> keyMap = null;
	private HashMap<Integer, Integer> valueMap = null;
	private int count;

	/** Initialize your data structure here. */
	public RandomizedSet() {
		keyMap = new HashMap<Integer, Integer>();
		valueMap = new HashMap<Integer, Integer>();
	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already contain
	 * the specified element.
	 */
	public boolean insert(int val) {
		if (keyMap.containsKey(val)) {
			return false;
		} else {
			keyMap.put(val, count);
			valueMap.put(count, val);
			count = keyMap.size();
			return true;
		}
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the specified
	 * element.
	 */
	public boolean remove(int val) {
		if (!keyMap.containsKey(val)) {
			return false;
		} else {
			int valueKey = keyMap.get(val);
			keyMap.remove(val);
			if (valueKey != valueMap.size() - 1) {
				valueMap.put(valueKey, valueMap.get(valueMap.size() - 1));
				keyMap.put(valueMap.get(valueMap.size() - 1), valueKey);
				valueMap.remove(valueMap.size() - 1);
			} else {
				valueMap.remove(valueKey);
			}
			count = keyMap.size();
			return true;
		}
	}

	/** Get a random element from the set. */
	public int getRandom() {
		Random random = new Random();
		int n = random.nextInt(keyMap.size());
		return valueMap.get(n);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomizedSet obj = new RandomizedSet();
		System.out.println(obj.insert(1));
		System.out.println(obj.insert(2));
		System.out.println(obj.insert(2));
		System.out.println(obj.remove(2));
		System.out.println(obj.getRandom());
	}

}
