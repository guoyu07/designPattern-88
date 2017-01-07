package 状态模式;
/*
 * 抽象状态类，定义一个接口以封装与Context的一个特定状态相关的行为。
 */
public interface State {
	public abstract void handle(Context context);                                                                                
}
