package ������ģʽ;
/*
 * ����һ����������Ľӿ�
 */
public abstract class Handler {
	protected Handler successor;
	
	//�����������һ��������
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	//��������ĳ��󷽷�
	public abstract void handleRequest(int request);
	
}
