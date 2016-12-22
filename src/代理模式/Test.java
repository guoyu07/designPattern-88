package 代理模式;

public class Test {
	public static void main(String[] args) {
		Proxy proxy=new Proxy();
		//通过代理对象完成对真实对象的调用
		proxy.request();
		
	}
}
