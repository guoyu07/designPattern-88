package ������ģʽ.��н;

public abstract class Manager {
	protected String name;
	//�ϼ�
	protected Manager superior;
	
	public Manager(String name){
		this.name=name;
	}
	
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
	
	public abstract void reqeustApplication(Request request);
}
