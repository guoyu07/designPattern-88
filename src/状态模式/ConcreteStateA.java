package 状态模式;
/*
 * 具体状态，每一个子类实现一个与Context的一个状态相关的行为。
 */
public class ConcreteStateA implements State{

	//设置ConcreteStateA的下一状态是ConcreteStateB
	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateB());
	}

}
