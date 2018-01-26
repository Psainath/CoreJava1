package com.tek.general;
class Comparision {
	
	public void comparision() {
		int x= 10;
		int y= 20;
		if(x<y) {
			System.out.println("x less than y");
		}
		else if(x>y){
			System.out.println("x greater than y");
		}
		else if(x==y) {
			System.out.println("the greater equal to y");	
			
		}				
	}
	
	public static void main (String args[]) {
	Comparision Comp = new Comparision();
	Comp.comparision();
		
}

}	