package com.greatlearning.service;

public class MergeSort {

	public void merge(int[] array, int left, int mid, int right) {
		
		//find size of two sub arrays to be merged
		int n1 = mid - left+1;
		int n2 = right - mid;
		
		//create temp arrays
		int leftArray [] = new int[n1];
		int rightArray[] = new int[n2];
		
		//copy data to temporary array
		for(int i = 0 ; i<n1 ; ++i) {
			leftArray[i] = array[left+i];
		}
		for(int j = 0; j<n2; ++j) {
			rightArray[j] = array[mid+1+j];
		}
		
		
		int i=0,j=0;
		
		int k = left;
		while(i<n1 && j<n2) {
			if(leftArray[i]>=rightArray[j]) {
				array[k]= leftArray[i];
				i++;
			}else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
	}
	
	public void sort(int[] notes,int left, int right) {
		if(left<right) {
			
			int mid = (left+right)/2;
		
			sort(notes,left,mid);
			sort(notes,mid+1,right);
			
			merge(notes,left,mid,right);
		}
		
	}
}
