package 装饰模式.变通实现Avatar;

public class Person {
	private String name;
	public Person(String name){
		this.name=name;
	}
	public Person(){
		
	}
	public  void show(){
		System.out.println("装扮的"+name);
	}
}
