package ����¼ģʽ;
/*
 * ����洢Originator������ڲ�״̬�����ɷ�ֹOriginator���������������ʱ���¼Memento��
 * ����¼�������ӿڣ�Caretakerֻ�ܿ�������¼��խ�ӿڣ���ֻ�ܽ�����¼���ݸ���������
 * 		Originator�ܹ�����һ����ӿڣ����������ʷ��ص���ǰ״̬������������ݡ�
 */
public class Memento {
	private String state;
	public Memento(String state) {
		// TODO Auto-generated constructor stub
		this.state=state;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
