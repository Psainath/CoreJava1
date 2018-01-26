package com.tek.general;

public class ReturnProgram {

	public ReturnProgram() {
		boolean t = true;
		System.out.println("Before the return.");
		if(t) return; // return to caller
		System.out.println("This won't execute.");
	}

	public static void main(String[] args) {
	 
		ReturnProgram Return = new ReturnProgram();
		
		

	}

}
