package 享元模式;
/*
 * 是不需要共享的Flyweight子类。因为Flyweight接口共享成为可能，但它并不强制共享。。。。。
 */
public class UnsharedConcreteFlyweight extends Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("不共享的具体Flyweight  "+extrinsicstate);
	}

}
