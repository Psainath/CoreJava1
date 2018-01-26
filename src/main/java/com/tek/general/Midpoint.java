package com.tek.general;

public class Midpoint {

	public Midpoint() {
		int value1 = 50; 
		int value2 = 100;
		while (++value1  < --value2) {
			System.out.println("the midpoint is :"+ value1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Midpoint middle = new Midpoint();
	}

}
