package ����ģʽ.�տ���;
/*
 * ���������ֻ࣬��Ҫȷ�� ���⴮�� ��˭
 */
public abstract class Command {
	protected Barbecuer receiver;
	
	public Command (Barbecuer receiver){
		this.receiver=receiver;
	}
	
	//ִ������
	public abstract void executeCommand();
	
	public abstract String toString();
}
