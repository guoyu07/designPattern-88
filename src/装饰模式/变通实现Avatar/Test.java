package װ��ģʽ.��ͨʵ��Avatar;

public class Test {
	public static void main(String[] args) {
		Person liuxiang=new Person("����");
		
		TShirts tShirts=new TShirts();
		BigTrouser bigTrouser=new BigTrouser();
		
		tShirts.decorate(liuxiang);
		bigTrouser.decorate(tShirts);
		bigTrouser.show();
	}
}
