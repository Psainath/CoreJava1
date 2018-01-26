package com.tek.general;

public class Continue_Example {

	public Continue_Example() {
	outer:for (int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
			if(j > i) {
			System.out.println();
			continue outer;
			}
			System.out.print(" " + (i * j));
			}
			}
			System.out.println();
	}
	
	public static void main (String args[]) {
		
		Continue_Example tri = new Continue_Example();
		
	}

}
