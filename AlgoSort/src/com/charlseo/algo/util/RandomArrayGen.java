package com.charlseo.algo.util;

public class RandomArrayGen {

	int size;
	int[] arrayList;
	
	public RandomArrayGen(int size) {
		this.size = size;
		arrayList = new int[size];
		generateRandomArray();
	}
	
	private void generateRandomArray() {
		
		for (int i = 0; i < size; i++){
			int n = (int) (Math.random()*99 + 1);
			arrayList[i] = n;
			
			System.out.println(arrayList[i]);
			
		}
	}
	
	public int[] getArrayList(){
		
		return arrayList;
	}
}
 