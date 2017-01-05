package 抽象工厂模式;
/*
 * 抽象工厂接口，它里面应该包含所有的产品创建的抽象方法
 */
public interface AbstractFactory {
	public AbstractProductA createProductA();
	public AbstractProductB createProductB();
	
}
