package com.greatlearning.service;

public class NumberOfNotesImplementation {

	public void countNote(int[] notes, int amount) {
		
		int[] counterNote = new int[notes.length];
		
		try {
			for(int i = 0 ; i < notes.length; i++) {
				if(amount>=notes[i]) {
					counterNote[i] = amount/notes[i];
					amount = amount - counterNote[i]*notes[i];
				}
			}
			if(amount>0) {
				System.out.println("This exact amount can not be given with the highest denomination");
			}else {
				System.out.println("your payment approach will be ");
				for(int i = 0 ; i < notes.length; i++) {
					if(counterNote[i]!=0) {
						System.out.println(notes[i] + ":" + counterNote[i]);
					}
				}
			}
		}catch(ArithmeticException ex) {
			System.out.println(ex + " note of denomination 0 is invalid");
		}
	}
}
