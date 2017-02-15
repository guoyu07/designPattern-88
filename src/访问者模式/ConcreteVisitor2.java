package 访问者模式;
/*
 * 具体访问者，实现每个由visitor声明的操作。每个操作实现算法的一部分，
 * 而该算法片段是对应于结构中对象的类。
 */
public class ConcreteVisitor2 extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.getClass().getName()+" 被 "+this.getClass().getName()+" 访问。。");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementB.getClass().getName()+" 被 "+this.getClass().getName()+" 访问。。");
	}

}
