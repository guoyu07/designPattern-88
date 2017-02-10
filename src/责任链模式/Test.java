package 责任链模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler h1=new ConcreteHandler();
		Handler h2=new ConcreteHandler2();
		Handler h3=new ConcreteHandler3();
		
		//设置链
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		int [] requests={2,5,14,22,18,3,27,20,33};
		
		//循环给最小处理着提交请求，不同的数额，由不同权限处理者处理
		for(int request:requests){
			h1.handleRequest(request);
		}
	}

}
