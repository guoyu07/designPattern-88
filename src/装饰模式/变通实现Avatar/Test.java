package 装饰模式.变通实现Avatar;

public class Test {
	public static void main(String[] args) {
		Person liuxiang=new Person("刘翔");
		
		TShirts tShirts=new TShirts();
		BigTrouser bigTrouser=new BigTrouser();
		
		tShirts.decorate(liuxiang);
		bigTrouser.decorate(tShirts);
		bigTrouser.show();
	}
}
