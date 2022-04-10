package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.Problem1ServiceClass;

public class Problem1MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array : ");
		//reading size of transaction array from the user
		int transactionArray = sc.nextInt();
		
		int[] arrayValues = new int[transactionArray];
				
		System.out.println("Enter the values of array :  ");
		for(int i=0; i<transactionArray; i++)  
		{  
		//reading array elements from the user   
			arrayValues[i]=sc.nextInt();  
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved : ");
		
		int totalTargets = sc.nextInt();
		
		Problem1ServiceClass problem1ServiceClass = new Problem1ServiceClass();
		
		while(totalTargets-- !=0) {
			
			long target = 0;
			
			System.out.println("Enter the value of target : ");
			
			target = (long)sc.nextInt();
			
			problem1ServiceClass.transactionManager(arrayValues, target);
			
		}
	}
}
