package com.tek.general;

public class ArrayPrinting {

	public void ArrayOD() {
		int arrayvalue1[];
		int arrayvalue2[];
		
		arrayvalue1 = new int[5];
		arrayvalue2 = new int[5];
		arrayvalue1[1] = 12;
		arrayvalue1[2] =13;
		arrayvalue1[3] =45;
		arrayvalue1[4] =11;
		arrayvalue1[0] =01;
		
		//addition of array values
		
	     arrayvalue2[1] = arrayvalue1[0]+arrayvalue1[1]+arrayvalue1[2]+arrayvalue1[3]+arrayvalue1[4] ;
		
		System.out.println(" the value of arrayvalue2[1] is " + arrayvalue2[1]);
		System.out.println(" the value of arrayvalue1[0] is " + arrayvalue1[0]);
		System.out.println(" the value of arrayvalue1[1] is " + arrayvalue1[1]);
		System.out.println(" the value of arrayvalue1[2] is " + arrayvalue1[2]);
		
		
	}

	public static void main(String[] args) {
		ArrayPrinting ArrPrint =new ArrayPrinting(); 
          ArrPrint.ArrayOD();
	}

}
