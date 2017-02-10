package 命令模式.烧烤店;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//开店前的准备
		
		//烤串师傅：执行命令的人
		Barbecuer boy=new Barbecuer();
		//提供的服务
		Command mutton=new BakeMuttonCommand(boy);
		Command wing=new BakeChickenWingCommand(boy);
		//服务员：隔离命令发起者和命令执行者
		Waiter girl=new Waiter();
		
		//顾客点餐：命令发起者发起命令
		girl.setOrder(mutton);
		girl.setOrder(wing);
		
		//点菜完毕，通知厨房
		girl.notice();
		
		girl.cancelOrder(mutton);
		
	}

}
