package OOPConceptPart2;

public class BMW extends Car{//Has a relationship
	
	//When same method is present in parent class and as well as in child class with same name and same no of argument, is called method overriding
	//When we have same method in child and parent so preferences given to child method
	public void start() {//Overridden method
		System.out.println("BMW--Start");
	}
	
	public void theftsafty() {
		System.out.println("BMW--theftsafty");
	}
}
