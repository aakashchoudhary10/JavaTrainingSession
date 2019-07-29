package OOPConceptPart1;

public class Car {

	// Class Variables
	int mod;
	int wheel;
	
	//1. Object Creation
	//new keyword is used to create an object
	//a,b,c are object reference variable
	
	public static void main(String[] args) {
		
		Car a = new Car(); //"a"- object reference variable--"new car()" is used to create car object
		Car b = new Car();
		Car c = new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2013;
		c.wheel=4;
		
		System.out.println("Before Assigning the referencce");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		
		//2. Shifting of object
		System.out.println("After shifting the references");
		
		a=b; //Here a object now refer to b object and left the previous a object
		b=c; //here b object refer to c object and left the previous b object
		c=a; //c=a=b-->c=b-->Here c object is refer to b object and left the previous c object
		
		a.mod=10;
		System.out.println(a.mod); //10
		c.mod=20;
		b.mod=30;
		System.out.println(a.mod); //20
		System.out.println(c.mod);//20
		System.out.println(b.mod);//20
		
		
		
		
		
		
		
		
		
	}

}
