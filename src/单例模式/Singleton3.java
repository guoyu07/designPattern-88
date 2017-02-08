package 单例模式;
/*
 * 饿汉,classloder机制避免了多线程的同步问题,没有达到lazy loading的效果
 */
public class Singleton3 {
	private static Singleton3 instance=new Singleton3();
	private Singleton3(){
		
	}
	public static Singleton3 getInstance(){
		return instance;
	}
}
