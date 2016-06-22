package com.charlseo.algo.sort;

public class QuickSort {
	
	private int[] arrayList;
	
	public void sort(int[] array) {
		this.arrayList = array;
		quicksort(0,arrayList.length - 1);
	}
	
	public void quicksort(int low, int high) {
		int i = low, j = high;
		//Get the pivot element from the middle of the list
		int pivot = arrayList[low + (high - low) / 2];
		
		// Divide in 2 lists
		while (i <= j) {
			
			// If the current value from the left list is smaller than the pivot
			// then get the next element from the left list
			while (arrayList[i] < pivot) {
				i++;
			}
			
			// If the current value from the right list is larger than the pivot
			// then get the next element from the right list
			while (arrayList[j] > pivot) {
				j--;
			}
			
			
			// If we have found a values in the left list which is larger than the pivot 
			// and if we have found a value in the right list which is smaller than the pivot, 
			// then we exchange the values. 
			// As we are done we can increase i and decrease j.
			if (i <= j) {
				exchange(i, j);
				
				System.out.println("After exchange: ");
				printArray(arrayList);
				i++;
				j--;
			}
		}
		
		//Recursion
		if(low < j) {
			quicksort(low, j);
			
			System.out.println("After recusrion low: ");
			printArray(arrayList);
		}
		if(i < high) {
			quicksort(i, high);
			
			System.out.println("After recusrion high: ");
			printArray(arrayList);
		}
	}
	
	private void exchange(int i, int j) {
		int temp = arrayList[i];
		arrayList[i] = arrayList[j];
		arrayList[j] = temp;
	}
	
	public void printArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
			
	}

}
