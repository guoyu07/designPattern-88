package 解释器模式;

import java.util.ArrayList;
import java.util.List;

/*
 * 客户端，构建表示该文法定义的语言中一个特定的句子的抽象语法树。调用解释操作
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context=new Context();
		List<AbstractExpression> list=new ArrayList<>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		
		for(AbstractExpression exp:list)
			exp.interpret(context);
	}

}
