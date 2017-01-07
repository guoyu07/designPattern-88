package 状态模式.工作状态实现;
//下午和傍晚的工作状态
public class AfternoonState implements State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getHour()<17){
			System.out.println("当前时间："+work.getHour()+" 点，下午状态还不错，继续努力");
		}else{
			work.setState(new EveningState());
			work.writeProgram();
		}
	}

}
