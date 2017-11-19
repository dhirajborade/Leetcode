package com.Microsoft.Easy;

public class NumberOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 18;
		System.out.println(countPrimes(n));
	}

	private static int countPrimes(int n) {
		boolean[] notPrime = new boolean[n];
		int primeCount = 0;
		for (int i = 2; i < n; i++) {
			if (notPrime[i] == false) {
				primeCount++;
				for (int j = 2; i * j < n; j++) {
					notPrime[i * j] = true;
				}
			}
		}
		return primeCount;
	}

}
