package ״̬ģʽ.����״̬ʵ��;
//��乤��״̬
public class EveningState implements State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getFinish()){
			//������������ת���°�״̬
			work.setState(new RestState());
			work.writeProgram();
		}else{
			if(work.getHour()<21){
				System.out.println("��ǰʱ�䣺"+work.getHour()+" �㣬�Ӱ࣬���Ƿ���");
			}else{
				work.setState(new SleepingState());
				work.writeProgram();
			}
		}
	}

}
