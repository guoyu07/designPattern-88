package 状态模式.工作状态实现;
//中午工作状态
public class NoonState implements State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getHour()<13){
			System.out.println("当前时间： "+work.getHour()+" 点，饿了，吃肉；犯困，午休");
		}else{
			work.setState(new AfternoonState());
			work.writeProgram();
		}
	}

}
