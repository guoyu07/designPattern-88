package װ��ģʽ;

public class ConcrerteDecoratorA extends Decorator{
	//������е�����
	private String addState;
	//������Component��operating������������ִ�б���Ĺ���
	public void operation(){
		super.operation();
		addState="new state";
		System.out.println("����װ�������A�Ĳ���");
	}
}
