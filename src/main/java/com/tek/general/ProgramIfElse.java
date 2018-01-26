package com.tek.general;

public class ProgramIfElse {
	
	public ProgramIfElse(){
				
	}

	public ProgramIfElse(int age , String name)  {
		
		if(name == "sainath" && age == 12  ) {
			
			age =24;
			System.out.println("the name and age is " + name + "..."  + age);
			
		}

		else if (name == "panchangam" && age  == 24) {
			age = 44 ;
			System.out.println("the name and age is" + name + "..."  + age);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ProgramIfElse condition = new ProgramIfElse(12,"sainath");
		 
	}

}
