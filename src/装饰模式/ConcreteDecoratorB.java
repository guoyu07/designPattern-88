package װ��ģʽ;

public class ConcreteDecoratorB extends Decorator{
	public void operation(){
		//������Component��operation��������ִ�б���Ĺ���
		super.operation();
		
		//����Ķ��з���
		addBehavior();
		System.out.println("����װ�������B�Ĳ���");
	}
	//�����addBehavior����
	private void addBehavior(){
		System.out.println("B ��addBehavior����");
	}
}
