package com.tek.general;

public class IterationWhile {

	public void Whilelooping(String name, int age) {
		int i = 0 ;
		while(i <= 5) {
		   	if (name == "sainath") {
		   		age = 24 ;
		   		System.out.println("the name is "+ name + "age is  " + age  );	
		   	}
		   	else 
		   		System.out.println("the name is " + name + "age is "+ age);
			
		}
	}

	public static void main(String[] args) {
		IterationWhile iterator = new IterationWhile();
          iterator.Whilelooping("ahmed", 18);
          

	}

}
