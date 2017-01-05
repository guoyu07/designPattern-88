package 抽象工厂模式;
//创建2型号产品
public class ConcreteFactory2 implements AbstractFactory{

	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
