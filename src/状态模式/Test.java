package ״̬ģʽ;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Context�ĳ�ʼ״̬�Ǵ�ConcreteStateA
		Context context=new Context(new ConcreteStateA());
		
		//���ϵ�����ʵʱ���״̬
		context.request();
		context.request();
		context.request();
		context.request();
	}

}
