package 单例模式;
/*懒汉式
 * 
 * 定义一个getInstance操作，允许客户端访问它的唯一实例。
 * getInstance是一个静态方法，主要负责创建自己的唯一实例。
 */
public class Singleton {
	private static Singleton instance;
	
	//私有的构造方法，堵死了外界利用new创建此类实例的可能
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance==null)
			instance=new Singleton();
		return instance;
	}
}
