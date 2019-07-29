package javaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String x[][]=new String[3][5];
		//String [][]j=new String[3][5]; -- we can also use square bracket before the variable name
		System.out.println(x.length); //total number of rows: 3
		System.out.println("****************");
		System.out.println(x[0].length);//Column are based on rows--it will give you number of column
		
		//1st row
		x[0][0]="a";
		x[0][1]="b";
		x[0][2]="c";
		x[0][3]="d";
		x[0][4]="e";
		
		//2nd row
		x[1][0]="a1";
		x[1][1]="b1";
		x[1][2]="c1";
		x[1][3]="d1";
		x[1][4]="e1";
		
		//3rd row
		x[2][0]="a2";
		x[2][1]="b2";
		x[2][2]="c2";
		x[2][3]="d2";
		x[2][4]="e2";
		
		System.out.println("****************");
		System.out.println(x[1][2]);
		System.out.println("****************");
		System.out.println(x.length+"*"+x[0].length);
		
		//Print all the value of 2D Array- use two for loops
		System.out.println("****************");
		for(int i=0;i<x.length;i++) // This is for row
		{
			for(int j=0;j<x[0].length;j++) { // This is for column
				System.out.println(x[i][j]);
			}
				
		}
		
		
	}

}
