package ÃüÁîÄ£Ê½.ÉÕ¿¾µê;
/*
 * ¿¾¼¦³áÃüÁî
 */
public class BakeChickenWingCommand extends Command{

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		receiver.bakeChickenWing();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "¿¾¼¦³á";
	}
	
}
