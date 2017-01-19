package 备忘录模式;
/*
 * 负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录Memento。
 * 备忘录有两个接口，Caretaker只能看到备忘录的窄接口，他只能将备忘录传递给其他对象。
 * 		Originator能够看到一个宽接口，允许它访问返回到先前状态所需的所有数据。
 */
public class Memento {
	private String state;
	public Memento(String state) {
		// TODO Auto-generated constructor stub
		this.state=state;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
