package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. While Loop:
		//dis-advantage of while loop: it will generate infinite loop if you don't give incremental/decremental part
		
		int i=0;//Initialization
		while(i<10) {//Conditional 
			System.out.println(i);
			i=i+1; //incremental/decremental
		}
		
		System.out.println("***********");
		
		//j++ means j=j+1;
		// print 1 to 10
		// for loop:
		for(int j=1;j<=10;j=j+1) {
			System.out.println(j);
		}
		
		System.out.println("***********");
		
		// print 10 to 1
		//k-- means k=k-1
		//10 9 8 7 6 5 4 3 2 1
		for(int k=10;k>=1;k--) {//initialization, conditional, increment/decrement
			System.out.println(k);
		}
		
	}

}
