package 原型模式.潜复制;
//工作经历
public class WorkExperience {
	private String workDate;
	private String company;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public WorkExperience(String workDate, String company) {
		super();
		this.workDate = workDate;
		this.company = company;
	}
}
