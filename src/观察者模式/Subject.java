package �۲���ģʽ;
//�ۼ����й۲��ߵ����ã�ÿ�����ⶼ�������κ������Ĺ۲��ߡ�
//���������ṩһ���ӿڣ��������Ӻ�ɾ���۲��߶���

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers=new LinkedList<>();
	
	//���ӹ۲���
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	//�Ƴ��۲���
	public void detach(Observer  observer){
		observers.remove(observer);
	}
	
	//֪ͨ
	public void notify1(){
		for( Observer o: observers){
			o.update();
		}
	}
}
