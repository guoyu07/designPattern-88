package 状态模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//设置Context的初始状态是从ConcreteStateA
		Context context=new Context(new ConcreteStateA());
		
		//不断的请求，实时变更状态
		context.request();
		context.request();
		context.request();
		context.request();
	}

}
