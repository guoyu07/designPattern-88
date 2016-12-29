package 外观模式;
/*
 * 由于Facade的作用，客户端可以根本不知三个子系统类的存在
 */
public class Test {
	public static void main(String[] args) {
		Facade facade=new Facade();
		facade.methodA();
		facade.methodB();
	}
	
}
