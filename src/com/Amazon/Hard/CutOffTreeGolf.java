/**
 *
 */
package com.Amazon.Hard;

import java.util.Arrays;
import java.util.List;

/**
 * @author dhirajborade
 *
 */
public class CutOffTreeGolf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
				cutOffTree(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(0, 0, 4), Arrays.asList(7, 6, 5))));
		System.out.println(
				cutOffTree(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(0, 0, 0), Arrays.asList(7, 6, 5))));
		System.out.println(
				cutOffTree(Arrays.asList(Arrays.asList(2, 3, 4), Arrays.asList(0, 0, 5), Arrays.asList(8, 7, 6))));
	}

	private static int cutOffTree(List<List<Integer>> forest) {
		return 0;
	}

}
