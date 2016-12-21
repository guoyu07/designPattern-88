package 装饰模式.变通实现Avatar;
//服饰类（Decorator）
public class Finery extends Person{
	protected Person component;
	
	//打扮
	public void decorate(Person component){
		this.component=component;
	}
	//show
	public void show(){
		if(component!=null){
			component.show();
		}
	}

}
