package 单例模式;
/*
 * 静态内部类，classloder的机制，lazy loading效果
 */
public class Singleton5 {
	private static class SingletonHolder{
		private static final Singleton5 instance=new Singleton5();
	}
	private Singleton5(){
		
	}
	public static Singleton5 getInstance(){
		return SingletonHolder.instance;
	}
}
