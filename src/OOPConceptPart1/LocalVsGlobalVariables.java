package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	//Golbal Variables--Class Variable-->Scope throughout the class or program
	String name = "Tom";
	int age =25;
	
	public static void main(String[] args) {
		int i=10;//Local Variable of main method
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		int total = obj.sum()+obj.age;
		System.out.println(total);
		
		
	}

	public int sum() {
		int i = 10; //Local Variable of sum method
		int j = 20;
		int age =25;
		int sum = i+j+age;
		return sum;
		
	}
	
}
