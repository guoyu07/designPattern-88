package 责任链模式.加薪;

public class Request {
	//申请类别
	private String requestType;
	
	//申请内容
	private String requestContent;
	
	//申请数量
	private int number;
	
	public void setNumber(int number) {
		this.number = number;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public int getNumber() {
		return number;
	}
	public String getRequestContent() {
		return requestContent;
	}
	public String getRequestType() {
		return requestType;
	}
}
