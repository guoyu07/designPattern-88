package 策略模式;

public class CashReturn extends CashSuper {
	//满多少减多少
	public CashReturn(int upper,int minus){
		this.upper=upper;
		this.minus=minus;
	}
	//上限
	private int upper;
	//优惠
	private int minus;

	@Override
	public Double acceptCash(Double money) {
		// TODO Auto-generated method stub
		if(money>=upper)
			money-=minus;
		return money;
	}

}
