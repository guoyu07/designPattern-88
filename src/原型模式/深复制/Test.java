package 原型模式.深复制;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume a=new Resume();
		a.setName("a");
		a.setSex("fale");
		a.setAge("18");
		a.setWorkExperience(new WorkExperience("2008-2013", "google"));
		
		Resume b=(Resume) a.clone();
		b.getWorkExperience().setCompany("facebook");
		
		a.display();
		b.display();
		
	}
}
