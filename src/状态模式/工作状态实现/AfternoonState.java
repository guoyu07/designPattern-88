package ״̬ģʽ.����״̬ʵ��;
//����Ͱ���Ĺ���״̬
public class AfternoonState implements State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getHour()<17){
			System.out.println("��ǰʱ�䣺"+work.getHour()+" �㣬����״̬����������Ŭ��");
		}else{
			work.setState(new EveningState());
			work.writeProgram();
		}
	}

}
