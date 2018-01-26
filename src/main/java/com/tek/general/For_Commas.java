package com.tek.general;

public class For_Commas {

	public void checker() {
		int value1 , value2 ;
		
		for(value1 = 2 ,value2 = 4 ;value2 < value2;value1++,value2++ ) {
			System.out.println("the value is less than value2");
			
		}
		
	}

	public static void main(String[] args) {
		For_Commas comma = new For_Commas();
		comma.checker();

	}

}
