package com.charlseo.algo;

import com.charlseo.algo.util.*;
import com.charlseo.algo.sort.HeapSort;

public class MainClass {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		RandomArrayGen randomArray = new RandomArrayGen(10);
		int[] arrayList = randomArray.getArrayList();
		HeapSort heapSort = new HeapSort();
		
		heapSort.sort(arrayList);
		System.out.println("From Main");
		heapSort.printArray(arrayList);
	}

}
