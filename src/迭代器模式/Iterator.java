package ������ģʽ;
/*
 * ���ڶ���õ���ʼ���󡢵õ���һ�������ж��Ƿ񵽽�β����ǰ����ȳ��󷽷���ͳһ�ӿ�
 */
public interface Iterator {
	public abstract Object first();
	public abstract Object next();
	public abstract boolean isDone();
	public abstract Object currentItem();

}
