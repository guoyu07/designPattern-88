package 模板方法模式;
/*
 * ConcreteClass，实现父类所定义的一个或多个抽象方法。
 * 每个AbstractClass都可以有任意多个ConcreteClass与之对应，
 * 而每个ConcreteClass都可以给出这些抽象方法的不同实现，从而使得顶级逻辑的实现各不相同。
 * 
 */
public class ConcreteClassA extends AbstractClass{
	@Override
	public void primitiveOperation1() {
		// TODO Auto-generated method stub
		System.out.println("具体类A方法1实现");
	}
	
	@Override
	public void primitiveOperation2() {
		// TODO Auto-generated method stub
		System.out.println("具体类A方法2实现");
	}
}
