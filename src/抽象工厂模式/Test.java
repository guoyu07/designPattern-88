package ���󹤳�ģʽ;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ʹ��factory1������Ʒ");
		AbstractFactory factory1=new ConcreteFactory1();
		AbstractProductA productA1=factory1.createProductA();
		AbstractProductB productB1=factory1.createProductB();
		
		System.out.println("ʹ��factory2������Ʒ");
		AbstractFactory factory2=new ConcreteFactory2();
		AbstractProductA productA2=factory2.createProductA();
		AbstractProductB productB2=factory2.createProductB();
		
	}

}
