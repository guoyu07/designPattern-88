package �н���ģʽ;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteMediator mediator=new ConcreteMediator();
		
		//����������ͬ����ʶ�н��߶���
		ConcreteColleague1 colleague1=new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2=new ConcreteColleague2(mediator);
		
		//���н�����ʶ��������ͬ�������
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		//����ͬ��������໥����Ϣ
		colleague1.send("how old are you��");
		colleague2.send("��ô�����㣿");
	}

}
