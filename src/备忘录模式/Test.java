package ����¼ģʽ;

public class Test {
	public static void main(String[] args) {
		//Originator��ʼ��״̬��״̬����Ϊ��ON��
		Originator  originator=new Originator();
		originator.setState("ON");
		originator.show();
		
		//����״̬ʱ���������˺ܺõķ�װ����������Originator��ʵ��ϸ��
		Caretaker c=new Caretaker();
		c.setMemento(originator.createMemento());
		
		//Originator�ı���״̬����ΪOFF
		originator.setState("OFF");
		originator.show();
		
		//�ָ�ԭʼ״̬
		originator.setMemento(c.getMemento());;
		originator.show();
		
	}
}
