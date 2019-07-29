package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		//Wrapper Classes--Integer , Double, Boolean
		//1. Data Conversion--String to Integer
		String x = "100";
		System.out.println(x+20);
		
		int a=Integer.parseInt(x);
		System.out.println(a+20);
		
		//2. String to double
		System.out.println("************************");
		String y = "12.33";
		System.out.println(y+10);
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		System.out.println("************************");
		
		//3. String to boolean
		String z = "true";
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		System.out.println("************************");
		//4. Int to String
		int l = 100;
		String s1 = String.valueOf(l);
		System.out.println(s1+20);
		System.out.println("************************");
		
		String u = "100A";
		Integer.parseInt(u);//NumberFormatException
		
	}

}
