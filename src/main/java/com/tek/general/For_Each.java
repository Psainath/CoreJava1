package com.tek.general;

public class For_Each {

	public void Substraction() {
		int value[]= {12,14,15,16,17,18,15,10,23};
		int sub = 0 ;
		for(int i:value ){
		    sub= sub - i ;
		    if(i == 3)
		    	break;
			
		}
		System.out.println(" the value after substraction is " + sub);
		
	}

	public static void main(String[] args) {
		For_Each agechecker = new For_Each();
		agechecker.Substraction();

	}

}
