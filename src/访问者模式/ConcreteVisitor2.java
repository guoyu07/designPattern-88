package ������ģʽ;
/*
 * ��������ߣ�ʵ��ÿ����visitor�����Ĳ�����ÿ������ʵ���㷨��һ���֣�
 * �����㷨Ƭ���Ƕ�Ӧ�ڽṹ�ж�����ࡣ
 */
public class ConcreteVisitor2 extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.getClass().getName()+" �� "+this.getClass().getName()+" ���ʡ���");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementB.getClass().getName()+" �� "+this.getClass().getName()+" ���ʡ���");
	}

}
