package 适配器模式;
/*
 * 通过在内部 包装一个需要适配的Adaptee对象，把源接口转换成目标接口
 */
public class Adapter extends Target{
	private Adaptee adaptee=new Adaptee();
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specificRequest();
	}
}
