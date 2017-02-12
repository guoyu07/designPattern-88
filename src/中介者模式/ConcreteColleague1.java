package 中介者模式;

public class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void send(String message){
		mediator.send(message, this);
	}
	
	public void notice(String message){
		System.out.println("同事1得到消息："+message);
	}

}
