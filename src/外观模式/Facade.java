package ���ģʽ;
//�����
/*
 * �������Ҫ�˽����е���ϵͳ�ķ��������ԣ�������ϣ��Ա�������
 */
public class Facade {
	SubSystemOne one;
	SubSystemTwo two;
	SubSystemThree three;
	SubSystemFour four;
	
	public Facade(){
		this.one=new SubSystemOne();
		this.two=new SubSystemTwo();
		this.three=new SubSystemThree();
		this.four=new SubSystemFour();
	}
	
	public void methodA(){
		System.out.println("������a");
		one.methodOne();
		two.methodTwo();
	}
	
	public void methodB(){
		System.out.println("������b");
		three.methodThree();
		four.methodFour();
	}
	
	
}
