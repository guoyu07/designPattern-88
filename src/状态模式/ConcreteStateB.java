package 状态模式;

public class ConcreteStateB implements State {
	//设置ConcreteStateB的下一状态是ConcreteStateA
	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateA());
	}

}
