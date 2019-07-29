package OOPConceptPart1;

public class MethodOverloading {
	//Duplicates method are not allowed
	//Methods are independent to each-other and we can not create one method inside the other method
	//We can also overload the main method

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
	int total =	obj.sum(10,20);
	System.out.println(total);
		
		
	}
	
	public static void main(int p) {
		
	}
	
    public static void main(String b) {
		
	}

    public static void main(int a,int b) {
	
    }
	
	
	//Method overloading-->When the method name is same with different no of argument or input parameter with in the same class
    //We can also overload method with same name, same no of argument but different data type 
	
	public void sum() { //0 input parameter
		System.out.println("Sum Method--Zero Parameter/Argument");
	}
	
	public void sum(double d) { //1 input parameter
		System.out.println("Sum Method--Zero Parameter/Argument with different data type");
	}
	
	public void sum(int i) { //1 input parameter
		System.out.println("Sum Method-- 1 input parameter");
		System.out.println(i);
		
	}
	
	public int sum(int a, int b) { //2 input parameter
		System.out.println("Sum Method-- 2 input parameter");
		int sum = a+b;
		return sum;
	}

}
