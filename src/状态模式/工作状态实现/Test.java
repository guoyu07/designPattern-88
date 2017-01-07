package 状态模式.工作状态实现;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//紧急项目
		Work emergencyProjects=new Work();
		emergencyProjects.setHour(9);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(10);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(12);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(13);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(14);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(17);
		
		emergencyProjects.setFinish(false);
		//emergencyProjects.setFinish(true);
		
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(19);
		emergencyProjects.writeProgram();
		emergencyProjects.setHour(22);
		emergencyProjects.writeProgram();
		
	}

}
