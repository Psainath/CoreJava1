package com.tek.general;

import java.io.IOException;

public class DowhileProgram {

	public void ContactDetails() throws IOException {
		char choice;
		
		do {
			System.out.println("Help on: ");
			System.out.println(" 1. name");
			System.out.println(" 2. age");
			System.out.println(" 3. DOB");
			System.out.println(" 4. Address");
			System.out.println(" 5. ContactNumber");
			System.out.println("Choose one:");
			
		    choice = (char) System.in.read();
		}  while( choice < '1' || choice > '5');
		System.out.println("\n");
		switch(choice) {
		case '1':		
		System.out.println("the name is sainath ");		
		break;
		case '2':
		System.out.println("The age is 24");
		case '3':
		System.out.println("Date Of Birth is 09/28/1993");
		break;
		case '4':
		System.out.println("the address is sweetberry ct");
		
		break;
		case '5':
		System.out.println("contact information is 203-123-123");
		break;
		}
		}

	public static void main(String[] args) throws IOException {
		DowhileProgram Contact = new DowhileProgram();
		Contact.ContactDetails();
	}

}
