package ״̬ģʽ.����״̬ʵ��;
//���繤��״̬
public class NoonState implements State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getHour()<13){
			System.out.println("��ǰʱ�䣺 "+work.getHour()+" �㣬���ˣ����⣻����������");
		}else{
			work.setState(new AfternoonState());
			work.writeProgram();
		}
	}

}
