package ״̬ģʽ.����״̬ʵ��;

public class Work {
	private State state;
	public Work(){
		//������ʼ��Ϊ���繤��״̬��������9�㿪ʼ�ϰ�
		state=new ForenoonState();
	}
	
	//�ӵ����ԣ�״̬ת�Ƶ�����
	private double hour;
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	
	//����������ԣ��Ƿ����°������
	private boolean finish=false;
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	public boolean getFinish(){
		return finish;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void writeProgram(){
		state.writeProgram(this);
	}
	
}
