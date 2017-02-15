package 访问者模式;
/*
 * 为对象结构中ConcreteElement的每一个类声明一个visit操作。。。。
 * 
 * 个人觉得访问者即使获得以下被访问对象结构某个实例的引用，然后调用这个对象的某个方法而已。。。。
 */
public abstract class Visitor {
	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
	
}
