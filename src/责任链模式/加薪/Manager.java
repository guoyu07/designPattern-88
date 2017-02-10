package 责任链模式.加薪;

public abstract class Manager {
	protected String name;
	//上级
	protected Manager superior;
	
	public Manager(String name){
		this.name=name;
	}
	
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
	
	public abstract void reqeustApplication(Request request);
}
