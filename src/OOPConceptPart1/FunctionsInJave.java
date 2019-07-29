package OOPConceptPart1;

public class FunctionsInJave {

	//main method-->Starting execution point
	//main method is void--never returns any value
	public static void main(String[] args) {
		
		FunctionsInJave obj =new FunctionsInJave();
		//one object will be created,obj is reference variable,refering to this object
		//After creating object,All non-static method copy will be given to this object
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String m = obj.qa();
		System.out.println(m);
		
		int n =obj.division(20, 10);
		System.out.println(n);
		
	}
	
	//Non-Static Mathod
	//void-does not return any value
	//return type is void
	public void test(){ //No Input,No Output Method
		System.out.println("Test Method");
	}
	
	//return type is int
	public int pqr() { //No input, Some Output Method
		System.out.println("PQR method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	//return type-->String
	public String qa() { //No Input,Some Output Method
		System.out.println("qa method");
		String s ="Selenium";
		return s;
	}
	
	//return type-->int
	// x,y-->Input Parameter/Arguments
	public int division(int x,int y) {//Some Input,Some Output Method
		System.out.println("division method");
		int d =x/y;
		return d;
	}

}
