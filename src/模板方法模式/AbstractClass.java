package 模板方法模式;

public abstract class AbstractClass {
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	//定义并实现一个模板方法，这个模板方法一般是一个具体方法，它给出一个顶级逻辑的骨架
	//而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现。顶级逻辑也可能调用一些具体方法。
	public void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("其他逻辑");
	}
}
