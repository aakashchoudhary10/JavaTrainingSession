package javaBasics;

public class DataTypes {

	//Hi this is my first java code
	/*Hi this
	is my first java code and 
	i am very happy*/
	
	//main method--> Starting and execution point of the java program
	public static void main(String[] args) {
		
		//Primitive data type: int, double, char, boolean 
		
		
		//1. integer:
		int i=10;
		// int i=20; Duplicate veriable is not allowed
		i=20; //way to update the previous value
		int j= 30;
		System.out.println(j);
		System.out.println(i+j);
		int k=40; //any statement in java should be ended by semi cloun (;) 
		int l=-12;
		System.out.println(l);
		int m=0;
		
		//2. double:
		double d =12.33;
		double d1 =34.33;
		System.out.println(d1);
		double d2 =100; //Java can store interger value in double but double into integer is not allowed, here 100 will be consider as 100.00;
		
		//3. Character: Only Single digit value and should be written within single quotes ('')
		char c= 'a';
		//char c= 'aa'; (Double digit Not allowed)
		char c1= 'A';
		char c2= '1';
		System.out.println(c1);
		
		//4. boolen:
		boolean b1=true;
		boolean b2=false;
		
		//5. String: it is a class not a datatype but we use it as datatypes
		String s="Hello World";
		String s1="This is my java code";
		String s2="1234567890";
		System.out.println(s1);
		
		

	}

}
