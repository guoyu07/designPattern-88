package ����ģʽ.��������;

public class Pursuit implements Gift{
	Girl girl;
	public Pursuit(Girl girl) {
		super();
		this.girl = girl;
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+"   ��������");
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+"    ���㻨");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+"    �����ɿ���");
	}

}
