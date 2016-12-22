package 代理模式;
//定义Proxy所代表的真实实体
public class RealSubject extends Subject{

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("真实的请求");
	}
	
}
