package 备忘录模式;
/*
 * 管理者，负责保存保存好备忘录Memento，不能对备忘录的内容进行操作或检查。
 */
public class Caretaker {
    private Memento  memento;
    public Memento getMemento() {
		return memento;
	}
    public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
