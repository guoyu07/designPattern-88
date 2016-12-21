package 装饰模式;

public class ConcrerteDecoratorA extends Decorator{
	//本类独有的属性
	private String addState;
	//先运行Component的operating（）方法，再执行本类的功能
	public void operation(){
		super.operation();
		addState="new state";
		System.out.println("具体装饰类对象A的操作");
	}
}
