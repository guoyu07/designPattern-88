package ģ�巽��ģʽ;

public abstract class AbstractClass {
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	//���岢ʵ��һ��ģ�巽�������ģ�巽��һ����һ�����巽����������һ�������߼��ĹǼ�
	//���߼�����ɲ�������Ӧ�ĳ�������У��Ƴٵ�����ʵ�֡������߼�Ҳ���ܵ���һЩ���巽����
	public void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("�����߼�");
	}
}
