package 装饰模式.变通实现Avatar;
//具体服装类 （ConcreteDecorator）
public class TShirts extends Finery{
	public void show(){
		System.out.println("大T恤");
		super.show();
	}
}
