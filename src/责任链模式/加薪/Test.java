package ������ģʽ.��н;
/*
 * �����Ҫ��չ�µĹ��������ֻ��Ҫ��������Ϳ��ԡ�������
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager jingli=new CommonManager("������");
		Manager zongjian=new Majordomo("����");
		Manager zongjingli=new GeneralManager("�����Ϻ�");
		
		//����
		jingli.setSuperior(zongjian);
		zongjian.setSuperior(zongjingli);
		
		Request request=new Request();
		request.setRequestType("���");
		request.setNumber(1);
		request.setRequestContent("���������");
		jingli.reqeustApplication(request);
		
		Request request2=new Request();
		request2.setRequestType("���");
		request2.setNumber(4);
		request2.setRequestContent("�������");
		jingli.reqeustApplication(request2);
		
		request.setRequestType("��н");
		request.setNumber(500);
		request.setRequestContent("��ǿ�������н");
		jingli.reqeustApplication(request);
		
		request.setRequestType("��н");
		request.setNumber(10000);
		request.setRequestContent("��˹�������н");
		jingli.reqeustApplication(request);
		
	}

}
