package �۲���ģʽ;
/*
 * ConcreteObserver�࣬����۲��ߣ�ʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ�
 * �Ա�ʹ����״̬�������״̬��Э��
 * ����۲��߶�����Ա���һ��ָ����������������á�
 */
public class ConcreteObserver extends Observer{
	private String name;
	private String observerState;
	private ConcreteSubject subject;
	
	public ConcreteObserver(ConcreteSubject subject, String name) {
		super();
		this.subject=subject;
		this.name=name;
	}
	
	public ConcreteSubject getSubject() {
		return subject;
	}
	
	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		observerState=subject.getSubjectState();
		System.out.println("�۲��� "+name+" ����״̬��"+observerState);
	}

}
