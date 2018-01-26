package com.tek.general;

public class Decrementation {

	//defining a method
	public void ForDecrement() {
		int value1=0;
		int value2= 5;
		
		for(;value1<=5;value1++) {
            // Decrementing value2 
			     value2= value2 - 1;
			     
			     //printing value
		          System.out.println("the value of value2 is" + value2);
			
		}
		
	}

	public static void main(String[] args)
	{
		
		 Decrementation Dec = new  Decrementation();
		 Dec.ForDecrement();

	}
	
	
	
}
