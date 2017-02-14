package 享元模式;
/*
 * 继承Flyweight，并为内部状态增加存储空间
 */
public class ConcreteFlyweight extends Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("可共享的具体Flyweight  "+extrinsicstate);
	}
	
}
