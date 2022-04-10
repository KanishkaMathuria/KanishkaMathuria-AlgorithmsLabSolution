package com.greatlearning.service;

public class Problem1ServiceClass {

	public void transactionManager(int[] arrayValues, long target) {
		
		int flag = 0;
		long sum = 0;
		for(int i = 0;i<arrayValues.length;i++) {
			
			sum+=arrayValues[i];
			
			if(sum>=target) {
				System.out.println("Target "+ target +" achieved after " + (i+1) + " transactions");
				
				flag = 1;
				
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Given target can not be achieved");
		}
	}

}
