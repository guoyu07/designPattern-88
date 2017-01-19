package 备忘录模式.游戏进度备忘录;

public class RoleStateCaretaker {
	private RoleStateMemento memento;
	public RoleStateMemento getMemento() {
		return memento;
	}
	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}
}
