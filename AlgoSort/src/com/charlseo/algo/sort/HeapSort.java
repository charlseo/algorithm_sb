package com.charlseo.algo.sort;

// teset
public class HeapSort {
	
	private int heapSize;
	private int left;
	private int right;
	private int largest;
	
	public void buildMaxHeap(int[] array){
		
		heapSize = array.length - 1; //
		
		for (int i = heapSize/2; i >= 0; i--){
			maxHeapify(array, i);
			
		}
	}
	
	public void maxHeapify(int[] array, int i){
		
		left = 2 * i;
		right = 2 * i + 1;
		System.out.println("Heapify start");
		System.out.println("Left:" + left + " Right: " + right);
		if (left <= heapSize && array[left] > array[i]){
			largest = left;
		} else {
			largest = i;
		}
		
		if (right <= heapSize && array[right] > array[largest]) {
			largest = right;
		} 
		//System.out.println("Left:" + left + " Right: " + right);
		
		if (largest != i) {
			exchange (array, i, largest);
			maxHeapify(array, largest);
			System.out.println("after Swap");
			System.out.println("Left:" + left + " Right: " + right);
		}
		
		
	}
	
	private void exchange (int[] array, int i, int largest) {
		
		//System.out.println("i: " + i + "   largest: " + largest);
		int temp = array[i];
		array[i] = array[largest];
		array[largest] = temp;
	}
	
	public void sort (int[] array) {
	/*	buildMaxHeap(array);
		System.out.print("after build heap");
		printArray(array);
		int n = array.length - 1;
		for (int i = n; i > 0; i--) {
			exchange(array, 0, i);
			n = n - 1;
			maxHeapify(array, 0);
		}
	*/
		
		heapSize = array.length - 1;
		
		System.out.print("Size: " + heapSize);
		
		for (int i = heapSize / 2; i >= 0; i--) {
			maxHeapify(array, i);
		}
		
		System.out.println("Initial heapify");
		printArray(array);
		
		for (int i = heapSize; i > 0; i--) {
			exchange(array, 0, i);
			heapSize--;
			maxHeapify(array, 0);
		}
		
	}
	
	public void printArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
			
	}
}
