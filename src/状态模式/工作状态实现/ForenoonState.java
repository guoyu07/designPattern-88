package ״̬ģʽ.����״̬ʵ��;
//���繤��״̬
public class ForenoonState implements State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getHour()<12){
			System.out.println("��ǰʱ�䣺"+work.getHour()+" �㣬���繤������������");
		}else{
			work.setState(new NoonState());
			work.writeProgram();
		}
	}

}
