package ����¼ģʽ;
/*
 * �����ˣ����𴴽�һ������¼Memento�����Լ�¼��ǰʱ�������ڲ�״̬������ʹ�ñ���¼�ָ��ڲ�״̬��
 * Originator�ɸ�����Ҫ����Memento�洢Originator����Щ�ڲ�״̬��
 */
public class Originator {
	//��Ҫ��������ԣ������ж��
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//��������¼������ǰ��Ҫ�������Ϣ���벢ʵ������һ��Memento����
	public Memento createMemento(){
		return new Memento(state);
	}
	
	//�ָ�����¼����Memento���벢��������ݻָ�
	public void setMemento(Memento memento){
		state=memento.getState();
	}
	
	//��ʾ����
	public void show(){
		System.out.println("state=  "+state);
	}
}
