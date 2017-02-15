package 访问者模式;
/*
 * 充分利用双分派技术，现实处理与数据结构的分离。。。。
 */
public class ConcreteElementA extends Element{

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementA(this);
	}
	
	public void operationA(){
		System.out.println("其他相关方法");
	}

}
