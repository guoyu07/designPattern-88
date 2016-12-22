package 代理模式;
//定义了RealSubject和Proxy的公共接口，这样就可以在任何使用RealSubject的地方是使用Proxy。
public abstract class Subject {
	public abstract void request();
}
