package com.tek.general;

public class NestedIf {

	public NestedIf() {
		
	}
	
	public  NestedIf(int x, int y,int z) {
		
		if(x == y) {
			System.out.println("X is equal to Y");
		}
		 if(x > y) {
			System.out.println("X is greater than Y");
						
		}
		if (x < y) {
			System.out.println("X is less than Y");
			
		}
	}

	public static void main(String[] args) {
		
		NestedIf Nested = new NestedIf(12,15,17);
		
	}

}
