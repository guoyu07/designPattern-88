package ������ģʽ;

public class ConcreteHandler3 extends Handler{

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>20&&request<=30){
			System.out.println(this.getClass().getName()+" ������ "+request+" �Ź��������");
		}else if(successor!=null){
			successor.handleRequest(request);
		}else{
			System.out.println("��ʱ����Ϊ "+request+" �Ź���ṩ��������������½⡣����");
		}
	}

}
