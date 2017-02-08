package 单例模式;
/*
 * 饿汉，变种,与Singleton3差不多
 */
public class Singleton4 {
	private static Singleton4 instance;
	static{
		instance=new Singleton4();
	}
	private Singleton4(){
		
	}
	public static Singleton4 getInstance(){
		return instance;
	}
}
