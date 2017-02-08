package 单例模式;
/*
 * 枚举，避免多线程同步问题，防止反序列化重新创建新的对象
 */

import org.omg.CORBA.PUBLIC_MEMBER;

public enum Singleton6 {
	INSTANCE;
	public void whateverMethod(){
		
	}
	
}
