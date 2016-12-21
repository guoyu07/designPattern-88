package 装饰模式;

public class ConcreteDecoratorB extends Decorator{
	public void operation(){
		//先运行Component的operation方法，在执行本类的功能
		super.operation();
		
		//本类的独有方法
		addBehavior();
		System.out.println("具体装饰类对象B的操作");
	}
	//本类的addBehavior方法
	private void addBehavior(){
		System.out.println("B 的addBehavior方法");
	}
}
