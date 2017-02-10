package 命令模式;

public class Test {
	public static void main(String[] args) {
		//执行请求的对象
		Receiver receiver=new Receiver();
		
		//发起请求的对象
		Command command=new ConcreteCommand(receiver);
		
		//传播请求的对象
		Invoker invoker=new Invoker();
		
		invoker.setCommand(command);
		invoker.executeCommand();
	}
}
