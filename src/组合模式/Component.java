package ���ģʽ;
/*
 * Ϊ����еĶ��������ӿڣ����ʵ�����£�ʵ�������๫�нӿڵ�Ĭ����Ϊ��
 * ����һ���ӿ����ڷ��ʺ͹���Component���Ӳ�����
 */
public abstract class Component {
	protected String name;
	public Component(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	//ͨ����add��remove�������ṩ���ӻ��Ƴ���Ҷ����֦�Ĺ���
	public abstract void  add(Component component);
	public abstract void remove(Component component);
	public abstract void display(int depth);
}
