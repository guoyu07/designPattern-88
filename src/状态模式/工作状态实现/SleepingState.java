package 状态模式.工作状态实现;

public class SleepingState implements State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		System.out.println("当前时间:"+work.getHour()+"点，不行了，睡着了");
	}

}
