package com.Amazon.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

	private static List<Integer> getRow(int rowIndex) {
		List<Integer> myList = new ArrayList<Integer>();
		if (rowIndex < 0) {
			return myList;
		}
		for (int i = 0; i < rowIndex + 1; i++) {
			myList.add(0, 1);
			for (int j = 1; j < myList.size() - 1; j++) {
				myList.set(j, myList.get(j) + myList.get(j + 1));
			}
		}
		return myList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRow(4));
	}

}
