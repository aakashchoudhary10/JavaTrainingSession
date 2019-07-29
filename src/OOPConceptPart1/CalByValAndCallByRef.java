package OOPConceptPart1;

public class CalByValAndCallByRef {
	
	int i;
	int j;

	public static void main(String[] args) {
		
		CalByValAndCallByRef obj = new CalByValAndCallByRef();
		
		int x=10;
		int y=20;
		int z=obj.sum(x, y);//Call by Value OR Pass by Value
		System.out.println(z);
		
		obj.i=50;
		obj.j=60;
		obj.swap(obj);
		
		//After Swaping the value
		System.out.println(obj.i);
		System.out.println(obj.j);
		
	}
	
	public int sum(int a, int b) {
		System.out.println("Sum Method");
		int c=a+b;
		return c;
	}
	
	//Call By Reference
	public void swap(CalByValAndCallByRef t) {
		int temp;
		temp=i; //temp=50
		i=j; //i=60
		j=temp; //j=50
	}

}
