package 装饰模式.变通实现Avatar;
//具体服饰类(ConcreteDecorator)
public class BigTrouser extends Finery{
	public void show(){
		System.out.println("垮裤");
		super.show();
	}
}
