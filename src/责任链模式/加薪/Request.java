package ������ģʽ.��н;

public class Request {
	//�������
	private String requestType;
	
	//��������
	private String requestContent;
	
	//��������
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
