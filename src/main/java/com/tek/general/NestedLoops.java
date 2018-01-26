package com.tek.general;

import java.util.Scanner;

public class NestedLoops {

	public void TriangleStar() {
		
		for(int i =5 ;i>1;i--)
		{	
			for(int j=0;j<i;++j) {
			System.out.println("*");			
				
			}
			System.out.println(" ");
		}
		
				
		
	}

	public static void main(String[] args) {
		NestedLoops loop = new NestedLoops();
		loop.TriangleStar();

	}

}
