package �Ž�ģʽ.�ֻ�Ʒ�ƾۺ��ֻ����;

public abstract class HandsetBrand {
	protected HandsetSoft soft;
	
	//Ʒ����Ҫ��ע��������Կ����ڻ����а�װ�����setSoft�����Ա�����
	public void setSoft(HandsetSoft soft) {
		this.soft = soft;
	}
	
	public abstract void run();
}
