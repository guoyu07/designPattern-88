package �۲���ģʽ;
/*
 * �ֽ�����������ģʽ
 * 
 */
public class Test {
	public static void main(String[] args) {
		ConcreteSubject s=new ConcreteSubject();
		
		s.attach(new ConcreteObserver(s, "x"));
		s.attach(new ConcreteObserver(s, "y"));
		s.attach(new ConcreteObserver(s, "z"));
		
		s.setSubjectState("abc");
		s.notify1();
		
	}
}
