package com.problem.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] myStringArray = new String[] {"abc", "ab", "aaaa", "az", "azrd"};
		System.out.print(longestCommonPrefix(myStringArray));
	}

	private static String longestCommonPrefix(String[] myStringArray) {
//		if(myStringArray == null || myStringArray.length == 0)    return "";
//	    String pre = myStringArray[0];
//	    int i = 1;
//	    while(i < myStringArray.length){
//	        while(myStringArray[i].indexOf(pre) != 0)
//	            pre = pre.substring(0,pre.length()-1);
//	        i++;
//	    }
//	    return pre;
		String myResultString = "";
		if (myStringArray != null && myStringArray.length > 0) {
			Arrays.sort(myStringArray);
			
			char[] firstString = myStringArray[0].toCharArray();
			char[] lastString = myStringArray[myStringArray.length - 1].toCharArray();
			
			for (int i = 0; i < firstString.length; i++) {
				if (lastString.length > i && firstString[i] == lastString[i]) {
					myResultString += firstString[i];
				} else {
					return myResultString;
				}
			}
		}
		return myResultString;
	}
}
