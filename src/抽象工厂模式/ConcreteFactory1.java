package ���󹤳�ģʽ;
//����1�ͺŲ�Ʒ
public class ConcreteFactory1 implements AbstractFactory{

	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}
	
}
