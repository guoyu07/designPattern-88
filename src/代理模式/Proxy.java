package ����ģʽ;
//����һ������ʹ�ô�����Է���ʵ�壬���ṩһ����Subject�Ľӿ���ͬ�Ľӿڣ���������Ϳ�����������ʵ��
public class Proxy extends Subject {
	private RealSubject realSubject;
	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(realSubject==null)
			realSubject=new  RealSubject();
		realSubject.request();
	}

}
