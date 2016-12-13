package ²ßÂÔÄ£Ê½;

public class CashRebate extends CashSuper{
	private Float rebate;
	public CashRebate(Float rebate){
		this.rebate=rebate;
	}
	@Override
	public Double acceptCash(Double money) {
		// TODO Auto-generated method stub
		return money*rebate;
	}

}
