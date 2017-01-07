package 状态模式.工作状态实现;

public class Work {
	private State state;
	public Work(){
		//工作初始化为上午工作状态，即上午9点开始上班
		state=new ForenoonState();
	}
	
	//钟点属性，状态转移的依据
	private double hour;
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	
	//任务完成属性，是否能下班的依据
	private boolean finish=false;
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	public boolean getFinish(){
		return finish;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void writeProgram(){
		state.writeProgram(this);
	}
	
}
