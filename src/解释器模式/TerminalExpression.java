package 解释器模式;
/*
 * 实现与文法中的终结符相关联的解释操作。实现抽象表达式中所要求的接口，主要是一个interpret方法。
 * 文法中每一个终结符都有一个具体中介表达式与之相对应。。。
 */
public class TerminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.out.println("终端解释器");
	}

}
