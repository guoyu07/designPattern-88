package ������ģʽ;
/*
 * ��������10��20֮������Ȩ����
 */
public class ConcreteHandler2 extends Handler{

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>10&&request<=20){
			System.out.println(this.getClass().getName()+" ������ "+request+" �Ź��������");
		}else{
			successor.handleRequest(request);
		}
	}

}
