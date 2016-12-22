package 代理模式.代理处对象;

public class Proxy implements Gift{
	private Pursuit pursuit;
	//构造方法的参数和实际对象的参数一样
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
