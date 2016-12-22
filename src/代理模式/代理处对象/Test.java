package 代理模式.代理处对象;

public class Test {
	public static void main(String[] args) {
		Girl girl=new Girl("一鸣");
		
		Proxy daili=new Proxy(girl);
		
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
		
	}
}
