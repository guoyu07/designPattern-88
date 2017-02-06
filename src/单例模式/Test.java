package µ¥ÀýÄ£Ê½;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton=Singleton.getInstance();
		Singleton singleton2=Singleton.getInstance();
		System.out.println("singleton"+singleton);
		System.out.println("singleton2"+singleton2);
		System.out.println("singleton==singleton2  :   "+(singleton==singleton2));
	}

}
