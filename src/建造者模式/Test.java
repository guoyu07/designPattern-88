package 建造者模式;

public class Test {
	public static void main(String[] args) {
		Director director=new Director();
		Builder b1=new ConcreteBuilder1();
		Builder b2=new ConcreteBuilder2();
		
		//指挥者用concreteBuilder1的方法来建造产品
		director.construct(b1);
		Product p1=b1.getResult();
		p1.show();
		
		director.construct(b2);
		Product p2=b2.getResult();
		p2.show();
		
		
	}
}
