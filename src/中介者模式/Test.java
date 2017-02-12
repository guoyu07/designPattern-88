package 中介者模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteMediator mediator=new ConcreteMediator();
		
		//让两个具体同事认识中介者对象
		ConcreteColleague1 colleague1=new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2=new ConcreteColleague2(mediator);
		
		//让中介者认识各个具体同事类对象
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		//具体同事类对象相互发消息
		colleague1.send("how old are you？");
		colleague2.send("怎么老是你？");
	}

}
