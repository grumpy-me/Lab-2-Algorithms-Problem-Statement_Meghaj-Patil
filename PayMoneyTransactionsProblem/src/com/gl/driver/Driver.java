package com.gl.driver;

import java.util.Scanner;

import com.gl.logic.Logic;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int numberOfTransactions = scanner.nextInt();
		
		int[] transactions = new int[numberOfTransactions];
		System.out.println("Enter the values of array");
		for (int i = 0; i < numberOfTransactions ; i++) {
			transactions[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int target = scanner.nextInt();
		
		int[] targets = new int[target];
		Logic logic = new Logic();
		
		for (int i = 0; i < target ; i++) {
			System.out.println("Enter the value of target");
			targets[i] = scanner.nextInt();
			logic.processTransactions(targets[i], transactions) ;
		}
		
	}

	
}
