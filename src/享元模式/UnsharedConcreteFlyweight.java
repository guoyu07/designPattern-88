package ��Ԫģʽ;
/*
 * �ǲ���Ҫ�����Flyweight���ࡣ��ΪFlyweight�ӿڹ����Ϊ���ܣ���������ǿ�ƹ�����������
 */
public class UnsharedConcreteFlyweight extends Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("������ľ���Flyweight  "+extrinsicstate);
	}

}
