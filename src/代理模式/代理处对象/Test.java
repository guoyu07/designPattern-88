package ����ģʽ.��������;

public class Test {
	public static void main(String[] args) {
		Girl girl=new Girl("һ��");
		
		Proxy daili=new Proxy(girl);
		
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
		
	}
}
