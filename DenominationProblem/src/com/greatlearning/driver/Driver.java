package com.greatlearning.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.services.CountNotes;
import com.greatlearning.services.MergeSort;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// init scanner
		// init mergesort countnotes bobect
		// get size of denominations
		// get values for denominations
		// apply the merge sort
		// count notes algorithm
		
		Scanner scanner = new Scanner(System.in) ;
		
		MergeSort mergeSort = new MergeSort() ;
		CountNotes countNotes = new CountNotes() ;
		
		int sizeOfDenomations = scanner.nextInt();
		
		int[] denominations = new int[sizeOfDenomations];
		
		for (int i = 0; i < sizeOfDenomations; i++) {
			denominations[i] = scanner.nextInt();
		}
		
		int amount = scanner.nextInt() ;
		
		mergeSort.sort(denominations, 0, denominations.length - 1);

		countNotes.processWithRecursion(denominations, amount);
		
	}
}
