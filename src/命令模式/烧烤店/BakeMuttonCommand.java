package ����ģʽ.�տ���;
/*
 * ����������
 */
public class BakeMuttonCommand extends Command{

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	//ִ������ʱ��ִ�о������Ϊ
	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub
		receiver.bakeMutton();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������";
	}

}
