package ����ģʽ;
//�ڹ��췽����ʵ�ּ򵥹����������ά�����Զ���


public class CashContext {
	private CashSuper cash=null;
	public CashContext(String type){
		switch(type){
		case "normal":
			cash=new CashNormal();
			break;
		case "full300minus100":
			cash=new CashReturn(300, 100);
			break;
		case "20%off":
			cash=new CashRebate(0.8f);
			break;
		}
	}
	//
	public double getResult(double money){
		return cash.acceptCash(money);
	}
}
