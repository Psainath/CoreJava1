package com.tek.general;

public class SwitchedCase {

	public void SwitchCase() {
		int i; 
		for(i=0;i<5;i++)
		{
			switch(i)
			{
			case 0:
				i = i+5;
				System.out.println("Th value of i is" + i );
				
			case 1: 
			    
				i = i-5;
				System.out.println("Th value of i is" + i );
			case 2: 
				i = i *5 ;
				
				System.out.println("Th value of i is" + i );
			case 3: 
				i = i/3 ;
				
				System.out.println("Th value of i is" + i );
				break;
				default:
				System.out.println("the program ends here");
				
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
	
		SwitchedCase SwitchC = new SwitchedCase();
	     SwitchC.SwitchCase();
		

	}

}
