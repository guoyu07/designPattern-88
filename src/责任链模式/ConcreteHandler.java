package ������ģʽ;
/*
 * ���崦�����࣬����������������󣬿ɷ������ĺ���ߣ�����ɴ�������󣬾ʹ���֮��
 * ����ͽ�������ת�������ĺ���ߡ�������
 * 
 * ����������0��10֮������Ȩ��������ת����һλ������
 */
public class ConcreteHandler extends Handler{
	
	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>=0&&request<=10){
			System.out.println(this.getClass().getName()+" ������ "+request+" �Ź��������");
		}else{
			successor.handleRequest(request);
		}
	}

}
