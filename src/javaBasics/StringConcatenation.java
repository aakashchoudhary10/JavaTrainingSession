package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// + sign is concatenation operator
		// Println is used to print on the console with a new line
		// Print is just used to print on the console
		
		int a = 100;
		int b = 200;
		
		String x= "Hello";
		String y="World";
		
		double c=12.33;
		double d=10.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);//300HelloWorld100Hello200World
		System.out.println(a+b+x+y+a+b);//300HelloWorld100200
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println("Hello World");
		System.out.println(a);
		System.out.println("The Value of a is:"+ a);
		System.out.println("The Value of a is:"+ b);
		System.out.println("The addition of a and b is"+(a+b));
		System.out.println("Hello Selenium");
		System.out.println("Hello Testing");
		System.out.print("Hello Selenium1");
		System.out.print("Hello Testing1");
		

		
		
		
		
	}

}
