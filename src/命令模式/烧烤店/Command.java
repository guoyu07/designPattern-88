package 命令模式.烧烤店;
/*
 * 抽象命令类，只需要确定 烤肉串者 是谁
 */
public abstract class Command {
	protected Barbecuer receiver;
	
	public Command (Barbecuer receiver){
		this.receiver=receiver;
	}
	
	//执行命令
	public abstract void executeCommand();
	
	public abstract String toString();
}
