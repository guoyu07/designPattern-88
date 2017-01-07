package 状态模式.工作状态实现;
//上午工作状态
public class ForenoonState implements State {

	@Override
	public void writeProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getHour()<12){
			System.out.println("当前时间："+work.getHour()+" 点，上午工作，精力充沛");
		}else{
			work.setState(new NoonState());
			work.writeProgram();
		}
	}

}
