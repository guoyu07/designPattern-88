package 享元模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//外部状态
		int extrinsicstate=23;
		
		FlyweightFactory factory=new FlyweightFactory();
		
		Flyweight a=factory.getFlyweight("a");
		a.operation(extrinsicstate--);
		
		
		Flyweight b=factory.getFlyweight("b");
		a.operation(extrinsicstate--);
		
		
		Flyweight c=factory.getFlyweight("c");
		a.operation(extrinsicstate--);
		
		Flyweight d=new UnsharedConcreteFlyweight();
		d.operation(extrinsicstate--);
		
		
	}

}
