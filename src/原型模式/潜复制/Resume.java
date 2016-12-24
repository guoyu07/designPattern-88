package 原型模式.潜复制;

public class Resume implements Cloneable{
	private String name;
	private String sex;
	private String age;
	private WorkExperience workExperience;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public WorkExperience getWorkExperience() {
		return workExperience;
	}


	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}


	/*public  Resume clone()  {
		return this.clone();
	}*/
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	public void display(){
		System.out.println(this.name+":"+this.age+"     "+this.sex);
		System.out.println(workExperience.getWorkDate()+"   "+ workExperience.getCompany());
	}
}
