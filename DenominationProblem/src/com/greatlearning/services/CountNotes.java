package com.greatlearning.services;

public class CountNotes {

	public void processWithRecursion(int[] notes, int amount) {

		if (notes.length == 0) {
			if (amount != 0) {
				System.out.print("Amount cannot be achieved.");
			}
			return ;
		}
		
		if (notes[0] == 0) {
			System.out.println("Fatal: Cannot divide by zero");
			return;
		}
		
		if (amount < notes[0]) {
			processWithRecursion(removeFirstElement(notes), amount);
		} else {
			int quotient = amount/notes[0] ;
			int remainder = amount % notes[0] ;
			System.out.print(notes[0] + ":" +quotient + "\n");
			if (remainder != 0) {
				processWithRecursion(removeFirstElement(notes), remainder);
			}
		}
		
	}
	
	int[] removeFirstElement(int[] notes) {
		int[] notesWithoutFirstElement = new int[notes.length - 1] ;
		for (int i = 1; i < notes.length ; i++) {
			notesWithoutFirstElement[i-1] = notes[i] ;
		}
		return notesWithoutFirstElement;
	}
}
