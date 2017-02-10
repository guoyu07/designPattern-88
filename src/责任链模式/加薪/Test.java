package 责任链模式.加薪;
/*
 * 如果需要扩展新的管理者类别，只需要增加子类就可以。。。。
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager jingli=new CommonManager("罗永浩");
		Manager zongjian=new Majordomo("马云");
		Manager zongjingli=new GeneralManager("隔壁老韩");
		
		//串链
		jingli.setSuperior(zongjian);
		zongjian.setSuperior(zongjingli);
		
		Request request=new Request();
		request.setRequestType("请假");
		request.setNumber(1);
		request.setRequestContent("王自如请假");
		jingli.reqeustApplication(request);
		
		Request request2=new Request();
		request2.setRequestType("请假");
		request2.setNumber(4);
		request2.setRequestContent("马化腾请假");
		jingli.reqeustApplication(request2);
		
		request.setRequestType("加薪");
		request.setNumber(500);
		request.setRequestContent("刘强东请求加薪");
		jingli.reqeustApplication(request);
		
		request.setRequestType("加薪");
		request.setNumber(10000);
		request.setRequestContent("马斯特请求加薪");
		jingli.reqeustApplication(request);
		
	}

}
