package ����ģʽ.��������;

public class Proxy implements Gift{
	private Pursuit pursuit;
	//���췽���Ĳ�����ʵ�ʶ���Ĳ���һ��
	public Proxy(Girl girl){
		pursuit=new Pursuit(girl);
	}
	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		pursuit.giveDolls();
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		pursuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		pursuit.giveChocolate();
	}

}
