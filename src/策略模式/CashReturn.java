package ����ģʽ;

public class CashReturn extends CashSuper {
	//�����ټ�����
	public CashReturn(int upper,int minus){
		this.upper=upper;
		this.minus=minus;
	}
	//����
	private int upper;
	//�Ż�
	private int minus;

	@Override
	public Double acceptCash(Double money) {
		// TODO Auto-generated method stub
		if(money>=upper)
			money-=minus;
		return money;
	}

}
