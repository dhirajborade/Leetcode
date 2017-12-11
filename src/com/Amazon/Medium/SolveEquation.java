/**
 *
 */
package com.Amazon.Medium;

/**
 * @author dhirajborade
 *
 */
public class SolveEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solveEquation("x+5-3+x=6+x-2"));
		System.out.println(solveEquation("x=x"));
		System.out.println(solveEquation("2x=x"));
		System.out.println(solveEquation("2x+3x-6x=x+2"));
		System.out.println(solveEquation("x=x+2"));
	}

	private static String solveEquation(String equation) {
		String[] equationArray = equation.split("=");
		int lhs = 0;
		int rhs = 0;
		String[] lhsList = equationArray[0].split("(?=\\+)|(?=\\-)");
		String[] rhsList = equationArray[1].split("(?=\\+)|(?=\\-)");
		for (String str : lhsList) {
			if (str.indexOf("x") >= 0) {
				lhs += Integer.parseInt(coefficient(str));
			} else {
				rhs -= Integer.parseInt(str);
			}
		}
		for (String str : rhsList) {
			if (str.indexOf("x") >= 0) {
				lhs -= Integer.parseInt(coefficient(str));
			} else {
				rhs += Integer.parseInt(str);
			}
		}
		if (lhs == 0) {
			if (rhs == 0) {
				return "Infinite solutions";
			} else {
				return "No solution";
			}
		}
		return "x=" + rhs / lhs;
	}

	private static String coefficient(String str) {
		if (str.length() > 1 && str.charAt(str.length() - 2) >= '0' && str.charAt(str.length() - 2) <= '9') {
			return str.replace("x", "");
		}
		return str.replace("x", "1");
	}

}
