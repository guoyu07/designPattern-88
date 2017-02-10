package 命令模式;
/*
 * 将一个接受者对象绑定于一个动作，调用接受者相应的操作，以实现execute
 */
public class ConcreteCommand extends Command{

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}
	
}
