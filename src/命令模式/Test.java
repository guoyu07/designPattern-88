package ����ģʽ;

public class Test {
	public static void main(String[] args) {
		//ִ������Ķ���
		Receiver receiver=new Receiver();
		
		//��������Ķ���
		Command command=new ConcreteCommand(receiver);
		
		//��������Ķ���
		Invoker invoker=new Invoker();
		
		invoker.setCommand(command);
		invoker.executeCommand();
	}
}
