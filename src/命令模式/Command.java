package ����ģʽ;
/*
 * ��������ִ�в����Ľӿ�
 */
public abstract class Command {
	protected Receiver receiver;
	public Command(Receiver receiver){
		this.receiver=receiver;
	}
	public abstract void execute();
}
