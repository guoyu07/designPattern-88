package ������ģʽ;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler h1=new ConcreteHandler();
		Handler h2=new ConcreteHandler2();
		Handler h3=new ConcreteHandler3();
		
		//������
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		int [] requests={2,5,14,22,18,3,27,20,33};
		
		//ѭ������С�������ύ���󣬲�ͬ������ɲ�ͬȨ�޴����ߴ���
		for(int request:requests){
			h1.handleRequest(request);
		}
	}

}
