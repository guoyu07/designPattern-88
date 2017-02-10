package 责任链模式;
/*
 * 当请求在10到20之间则有权处理
 */
public class ConcreteHandler2 extends Handler{

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>10&&request<=20){
			System.out.println(this.getClass().getName()+" 处理了 "+request+" 号贵宾的请求");
		}else{
			successor.handleRequest(request);
		}
	}

}
