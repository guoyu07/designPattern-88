package ������ģʽ;
/*
 * �������˫���ɼ�������ʵ���������ݽṹ�ķ��롣������
 */
public class ConcreteElementA extends Element{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementA(this);
	}
	
	public void operationA(){
		System.out.println("������ط���");
	}

}
