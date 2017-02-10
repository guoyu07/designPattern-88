package 命令模式.烧烤店;
/*
 * 烤羊肉命令
 */
public class BakeMuttonCommand extends Command{

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	//执行命令时，执行具体的行为
	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		receiver.bakeMutton();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "烤羊肉";
	}

}
