package com.tek.general;

public class PrimeOrNot {

	public PrimeOrNot(int num,boolean primevalidate) {
		if(num< 2) {
			primevalidate = false;
		}
		else
			primevalidate = true ;
		for(int i = 2;i<num/i;i++) {
			
			if(num % i == 0) {
				
				primevalidate = false ;
				break;
			}
			if(primevalidate) {
				System.out.println("the numebr is prime");
			}
			else
				System.out.println("the number is not prime");
		}
	}
	
	public static void main(String args[]) {
		PrimeOrNot checker =new PrimeOrNot(24,false); 
	}

}
