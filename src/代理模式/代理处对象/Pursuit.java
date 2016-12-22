package 代理模式.代理处对象;

public class Pursuit implements Gift{
	Girl girl;
	public Pursuit(Girl girl) {
		super();
		this.girl = girl;
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+"   送你娃娃");
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+"    送你花");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(girl.getName()+"    送你巧克力");
	}

}
