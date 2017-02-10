package 命令模式.烧烤店;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Waiter {
	//增加存放具体命令的容器
	private List<Command>orders=new ArrayList<>();
	
	//设置订单
	public void setOrder(Command command){
		//在客户提出请求时，对没货的烧烤进行回绝
		if(command.getClass().getModifiers()==orders.size()+100000000){
			System.out.println("该项目今天不出钟！！！");
		}else{
			orders.add(command);
		}
	}
	
	//取消订单
	public void cancelOrder(Command command){
		orders.remove(command);
		//时间代码例子：http://www.cnblogs.com/minisculestep/archive/2015/10/25/4908368.html
		Date date=new Date(0);
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("取消订单："+command.toString()+"取消时间："+sdf.format(date));
	}
	
	//通知全部执行
	public void notice(){
		for(Command command:orders){
			command.executeCommand();
		}
	}
}
