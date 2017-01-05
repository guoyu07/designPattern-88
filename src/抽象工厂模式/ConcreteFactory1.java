package 抽象工厂模式;
//创建1型号产品
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
