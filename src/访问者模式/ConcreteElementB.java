package ������ģʽ;
/*
 * �������˫���ɼ�������ʵ���������ݽṹ�ķ��롣������
 */
public class ConcreteElementB extends Element{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementB(this);
	}
	
	public void operation(){
		System.out.println("������ط���");
	}

}
