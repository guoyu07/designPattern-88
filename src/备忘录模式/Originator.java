package 备忘录模式;
/*
 * 发起人：负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，并可使用备忘录恢复内部状态。
 * Originator可根据需要决定Memento存储Originator的哪些内部状态。
 */
public class Originator {
	//需要保存的属性，可能有多个
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	//创建备忘录，将当前需要保存的信息导入并实例化出一个Memento对象
	public Memento createMemento(){
		return new Memento(state);
	}
	
	//恢复备忘录，将Memento导入并将相关数据恢复
	public void setMemento(Memento memento){
		state=memento.getState();
	}
	
	//显示数据
	public void show(){
		System.out.println("state=  "+state);
	}
}
