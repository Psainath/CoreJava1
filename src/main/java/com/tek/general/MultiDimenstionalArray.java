package com.tek.general;

public class MultiDimenstionalArray {

	public void MultiArray() {
		int sum = 0;
		int nums[][] = new int[3][5];
 		  for(int i = 0; i < 3; i++)
		     for(int j = 0; j < 5; j++)
		           nums[i][j] = (i+1)*(j+1);
		
 		  
		for(int x[] : nums) {
		for(int y : x) {
		System.out.println("Value is: " + y);
		sum += y;
		}
		}
		System.out.println("Summation: " + sum);
		}

	    public static void main(String[] args) {
		    MultiDimenstionalArray MultiDim = new MultiDimenstionalArray();
		        MultiDim.MultiArray();

	}

}
