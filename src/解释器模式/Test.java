package ������ģʽ;

import java.util.ArrayList;
import java.util.List;

/*
 * �ͻ��ˣ�������ʾ���ķ������������һ���ض��ľ��ӵĳ����﷨�������ý��Ͳ���
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
