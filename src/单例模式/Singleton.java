package ����ģʽ;
/*����ʽ
 * 
 * ����һ��getInstance����������ͻ��˷�������Ψһʵ����
 * getInstance��һ����̬��������Ҫ���𴴽��Լ���Ψһʵ����
 */
public class Singleton {
	private static Singleton instance;
	
	//˽�еĹ��췽�����������������new��������ʵ���Ŀ���
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance==null)
			instance=new Singleton();
		return instance;
	}
}
