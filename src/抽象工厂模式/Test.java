package 抽象工厂模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("使用factory1创建产品");
		AbstractFactory factory1=new ConcreteFactory1();
		AbstractProductA productA1=factory1.createProductA();
		AbstractProductB productB1=factory1.createProductB();
		
		System.out.println("使用factory2创建产品");
		AbstractFactory factory2=new ConcreteFactory2();
		AbstractProductA productA2=factory2.createProductA();
		AbstractProductB productB2=factory2.createProductB();
		
	}

}
