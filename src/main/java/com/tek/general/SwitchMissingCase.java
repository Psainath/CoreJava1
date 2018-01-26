package com.tek.general;

public class SwitchMissingCase {

	public void missingcase() {
		
		for( int i =0;i<12;i++)
		{
				switch(i)
				{
				case 0:
				case 1:
				case 2:
				case 3:
				case 4 :
				case 5 :
					i = 45 ;
					System.out.println("THe value of i is" + i );
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
				case 12:
					System.out.println("12 case is checked"); 
					break;
					default: 
						System.out.println("no case matched");			
				
				}											
		 }
	}
public static void main(String args[]) {
	
	SwitchMissingCase Cases = new SwitchMissingCase();
	Cases.missingcase();
	
}
	
	
}
