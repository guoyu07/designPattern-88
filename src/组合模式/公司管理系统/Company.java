package 组合模式.公司管理系统;

public abstract class Company {
	protected String name;
	public Company(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	public abstract void add(Company company);
	
	public abstract void remove(Company company);
	
	public abstract void display(int depth);
	
	protected String getSign(int number){
		String ret="";
		for(int i=0;i<number;i++)
			ret+="-";
		return ret;
	}
	
	public abstract void lineOfDuty();//履行职责，不同的部门履行不同的职责

}
