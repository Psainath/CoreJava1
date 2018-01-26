package com.tek.general;

public class CalculateArea {
	public void Double() {
		double radius,area;
		double pi= 3.14;
		radius= 12.5;
		
		area = radius *radius * 3.14 ;
		System.out.println("the area is "+ area);
		
		
		
	}

	public static void main(String[] args) {
		CalculateArea area = new CalculateArea ();
		area.Double();
		
	}

}
