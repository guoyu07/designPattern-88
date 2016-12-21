package в╟йндёй╫;

public class Test {
	public static void main(String[] args) {
		ConcreteComponent c=new ConcreteComponent();
		ConcrerteDecoratorA d1=new ConcrerteDecoratorA();
		ConcreteDecoratorB d2=new ConcreteDecoratorB();
		
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
		
	}
}
