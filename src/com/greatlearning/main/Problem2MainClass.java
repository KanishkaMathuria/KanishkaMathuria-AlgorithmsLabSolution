package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.MergeSort;
import com.greatlearning.service.NumberOfNotesImplementation;

public class Problem2MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MergeSort mergeSort = new MergeSort();
		NumberOfNotesImplementation numberOfNotesImplementation = new NumberOfNotesImplementation();
		
		System.out.println("Enter the size of currency denominations : ");
		int noOfDenominations = sc.nextInt();
		
		int[] currencyDenominations = new int[noOfDenominations];
		
		System.out.println("Enter the currency denominations value :  ");
		for(int i=0; i<noOfDenominations; i++)  
		{  
		//reading array elements from the user   
			currencyDenominations[i]=sc.nextInt();  
		}
		
		System.out.println("Enter the amount you want to pay : ");
		
		int amountToPay = sc.nextInt();
		
		mergeSort.sort(currencyDenominations, 0, currencyDenominations.length-1);
		numberOfNotesImplementation.countNote(currencyDenominations, amountToPay);
		
	}
}
