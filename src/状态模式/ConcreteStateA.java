package ״̬ģʽ;
/*
 * ����״̬��ÿһ������ʵ��һ����Context��һ��״̬��ص���Ϊ��
 */
public class ConcreteStateA implements State{

	//����ConcreteStateA����һ״̬��ConcreteStateB
	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateB());
	}

}
