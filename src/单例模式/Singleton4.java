package ����ģʽ;
/*
 * ����������,��Singleton3���
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
