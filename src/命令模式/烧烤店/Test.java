package ����ģʽ.�տ���;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ǰ��׼��
		
		//����ʦ����ִ���������
		Barbecuer boy=new Barbecuer();
		//�ṩ�ķ���
		Command mutton=new BakeMuttonCommand(boy);
		Command wing=new BakeChickenWingCommand(boy);
		//����Ա������������ߺ�����ִ����
		Waiter girl=new Waiter();
		
		//�˿͵�ͣ�������߷�������
		girl.setOrder(mutton);
		girl.setOrder(wing);
		
		//�����ϣ�֪ͨ����
		girl.notice();
		
		girl.cancelOrder(mutton);
		
	}

}
