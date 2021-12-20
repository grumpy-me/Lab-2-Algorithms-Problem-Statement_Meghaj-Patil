package com.gl.logic;

public class Logic {

	public void processTransactions(int target, int[] payments) {
		int temp = target;
		for (int i = 0; i < payments.length; i++) {
			temp = temp - payments[i] ;
			if (temp <= 0) {
				System.out.println("Achieved after " + (i+1) + " transactions.");
				return;
			}
		}
		System.out.println("Not Achieved.");
	}
}
