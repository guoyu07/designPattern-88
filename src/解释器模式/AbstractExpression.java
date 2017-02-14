package 解释器模式;

/*
 * 声明一个抽象解释操作，这个接口为抽象语法树中所有的结点所共享。
 */

public abstract class AbstractExpression {
	public abstract void interpret(Context context);
}
