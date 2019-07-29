package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		//Array is used to store similar data type value in a single variable
		
		//1. int array
		// lowest index=0
		//Highest index=n-1 (n is size of array)
		//i.length = size of array

		//Disadvantage of array:
		//1. size is fixed -- static array-- To overcome this problem we use collection(i.e Array list, Hashtable e.t.c)-->Dynamic Array
		//2. it stores only similar data type values-- To overcome this problem we use object array
		
		
		int i[] =new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		// System.out.println(i[5]); //ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		
		//To print all the value of array use 'for' loop
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//2. double array
		double d[]= new double[4];
		d[0]=10.10;
		d[1]=11.11;
		d[2]=12.12;
		d[3]=13.13;
		System.out.println(d[0]);
		System.out.println(d[3]);
		
		//3. Char Array
		
		char c[]=new char[3];
		c[0]='A';
		c[1]=10;
		c[2]='B';
		
		//4. boolean Array
		
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5. String Array
		
		String s[]=new String[3];
		
		s[0]="Test";
		s[1]="Hello";
		s[2]="World";
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		System.out.println(s.length);
		for(int k=0;k<s.length;k++) {
			System.out.println(s[k]);
		}
		
		System.out.println("*****************");
		
		for(int k=s.length-1;k>=0;k--) {
			System.out.println(s[k]);
		}
		
		//6. Object Array-- it is used to store different data type values in single variable
		
		Object ob[]=new Object[6];
		
		ob[0]="Tom";
		ob[1]=40;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='M';
		ob[5]="London";
		
		System.out.println("*****************");
		
		System.out.println(ob[0]);
		System.out.println(ob.length);
		
		System.out.println("*****************");
		for(int l=0;l<ob.length;l++)
		{
			System.out.println(ob[l]);
		}
		
		
		
		
		
		
	}

}
