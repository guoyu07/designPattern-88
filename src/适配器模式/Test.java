package 适配器模式;

public class Test {
	public static void main(String[] args) {
		Target target=new Adapter();//用适配器创建对象
		target.request();
	}
}
