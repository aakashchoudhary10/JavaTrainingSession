package OOPConceptPart1;

public class StaticAndNonStatic {
	
	//Global Variables: The scope of global variables will be available across all the functions with some conditions
	String name="Tom"; //Non-Static global variable
	static int age=25; //Static global variable	

	public static void main(String[] args) {	
		
		//How to access static method and variables 
		//1. Direct Method Calling of static method
		sum();
		//2. Call static method by using Class name
		StaticAndNonStatic.sum();
		System.out.println(age); // direct calling of static variable
		System.out.println(StaticAndNonStatic.age); //Call static variable by using Class name
		
		//How to access non-static method and variables 
		StaticAndNonStatic obj = new StaticAndNonStatic(); //To call non static method or variable we need to create an object
		obj.sendmail();  //Calling of non-static method by using class object
		System.out.println(obj.name); //Calling of non-static variable by using class object

		/*Can we call static method or variable by using class object? yes
		But we will get a warning message that static method or variable/field should be called in a static way*/
		obj.sum();
		System.out.println(obj.age);
		
	}
	
	public void sendmail() { // Non-Static Method
		System.out.println("Send Mail Method");
	}

	public static void sum() { //Static Method
		System.out.println("Sum Method");
	}
	
}
