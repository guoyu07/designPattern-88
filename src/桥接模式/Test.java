package ге╫сдёй╫;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction abstraction=new RefinedAbstraction();
		
		abstraction.setImplementor(new ConcreteImplementorA());
		abstraction.operation();
		
		abstraction.setImplementor(new ConcreteImplementorB());
		abstraction.operation();
		
	}

}
