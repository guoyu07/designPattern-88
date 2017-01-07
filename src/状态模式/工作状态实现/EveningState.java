package 状态模式.工作状态实现;
//晚间工作状态
public class EveningState implements State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getFinish()){
			//如果完成任务，则转入下班状态
			work.setState(new RestState());
			work.writeProgram();
		}else{
			if(work.getHour()<21){
				System.out.println("当前时间："+work.getHour()+" 点，加班，甚是乏累");
			}else{
				work.setState(new SleepingState());
				work.writeProgram();
			}
		}
	}

}
