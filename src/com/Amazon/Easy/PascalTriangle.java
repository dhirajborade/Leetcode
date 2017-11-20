package com.Amazon.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	private static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> finalResult = new ArrayList<List<Integer>>();
		ArrayList<Integer> singleRow = new ArrayList<Integer>();
		
		for (int i = 0; i < numRows; i++) {
			singleRow.add(0,1);
			for (int j = 1; j < singleRow.size() - 1; j++) {
				singleRow.set(j, singleRow.get(j) + singleRow.get(j + 1));
			}
			finalResult.add(new ArrayList<Integer>(singleRow));
		}
		return finalResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generate(5));
	}

}
