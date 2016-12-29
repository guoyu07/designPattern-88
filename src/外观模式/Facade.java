package 外观模式;
//外观类
/*
 * 外观类需要了解所有的子系统的方法或属性，进行组合，以备外界调用
 */
public class Facade {
	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	SubSystemFour four;
	
	public Facade(){
		this.one=new SubSystemOne();
		this.two=new SubSystemTwo();
		this.three=new SubSystemThree();
		this.four=new SubSystemFour();
	}
	
	public void methodA(){
		System.out.println("方法组a");
		one.methodOne();
		two.methodTwo();
	}
	
	public void methodB(){
		System.out.println("方法组b");
		three.methodThree();
		four.methodFour();
	}
	
	
}
