package OOPConceptPart2;

public class TestCar{

	public static void main(String[] args){
		
		//Static Polymorphism or Compile Time Polymorphism
		BMW bm = new BMW();
		bm.start();
		bm.stop();
		bm.refuel();
		bm.theftsafty();
		bm.engine();
		
		System.out.println("******************");
		
		Car cr = new Car();
		cr.start();
		cr.stop();
		cr.refuel();
		cr.engine();
		
		//Top Casting
		Car c= new BMW();//Child Class object can be referenced by parent class reference variable--Dynamic Polymorphism--run time polymorphism
		c.start();
		c.refuel();
		c.stop();
		//c.theftsafty();-->Using Dynamic polymorphism we can only call overridden method and parent class method if parent is the reference and child is the object
		// Other child method are not accessible by parent reference variable
		c.engine();
		
		//Down Casting
		//BMW b = new Car(); -->Child class reference can not called parent class object-->Big thing can not fit inside the small thing
		BMW b= (BMW) new Car();//Through casting we can do down casting but it will give you an run time exception "ClassCastException"
		
		
		
		
	}

}
