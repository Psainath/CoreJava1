package com.tek.general;

public class Lighting {
	
	public void lighting() {
		long lightspeed = 111111111 ;
		long seconds;
		int days = 45;
		long distance ; 
		
		seconds = days *60* 60 ;
		
		distance = lightspeed * seconds ; 
		System.out.println("In these many days" + days );
		System.out.println("the Day light will travel  " + distance + "miles");			
		
	}
	public static void main(String args[]) {
		Lighting Speed = new Lighting();
		Speed.lighting();
		
		
	}

}
