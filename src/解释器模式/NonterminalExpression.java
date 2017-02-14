package 解释器模式;
/*
 * 为文法中的非终结符实现解释操作。对文法中每一条规则都需要一个具体的非终结符表达式类。
 * 通过实现抽象表达式的interpret方法实现解释器操作。解释器操作一递归方式调用上面所提到的各规则中各符号的实例变量
 * 
 */
public class NonterminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.out.println("非终端解释器");
	}

}
