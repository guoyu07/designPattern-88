package ������ģʽ;
/*
 * ͨ�����ڲ� ��װһ����Ҫ�����Adaptee���󣬰�Դ�ӿ�ת����Ŀ��ӿ�
 */
public class Adapter extends Target{
	private Adaptee adaptee=new Adaptee();
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specificRequest();
	}
}
