package 备忘录模式;

public class Test {
	public static void main(String[] args) {
		//Originator初始化状态，状态属性为“ON”
		Originator  originator=new Originator();
		originator.setState("ON");
		originator.show();
		
		//保存状态时，由于有了很好的封装，可以隐藏Originator的实现细节
		Caretaker c=new Caretaker();
		c.setMemento(originator.createMemento());
		
		//Originator改变了状态属性为OFF
		originator.setState("OFF");
		originator.show();
		
		//恢复原始状态
		originator.setMemento(c.getMemento());;
		originator.show();
		
	}
}
