package ״̬ģʽ;

public class ConcreteStateB implements State {
	//����ConcreteStateB����һ״̬��ConcreteStateA
	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateA());
	}

}
