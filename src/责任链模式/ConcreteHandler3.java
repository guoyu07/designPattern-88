package 责任链模式;

public class ConcreteHandler3 extends Handler{

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>20&&request<=30){
			System.out.println(this.getClass().getName()+" 处理了 "+request+" 号贵宾的请求");
		}else if(successor!=null){
			successor.handleRequest(request);
		}else{
			System.out.println("暂时不能为 "+request+" 号贵宾提供特殊请求服务，请谅解。。。");
		}
	}

}
