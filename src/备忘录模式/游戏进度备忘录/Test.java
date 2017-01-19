package 备忘录模式.游戏进度备忘录;

public class Test {
	public static void main(String[] args) {
		//大战boss前
		GameRole lo=new GameRole();
		lo.initState();
		lo.display();
		
		//保存进度，由于封装在memento中，因此我们并不知道保存了哪些具体的角色数据
		RoleStateMemento memento=lo.getGameRole();
		RoleStateCaretaker stateAdmin=new RoleStateCaretaker();
		stateAdmin.setMemento(memento);
		
		//大战boss时，损耗严重
		lo.setAtk(0);
		lo.setDef(0);;
		lo.setVit(0);
		lo.display();
		
		//恢复大战boss前状态
		lo.recoveryState(stateAdmin.getMemento());
		lo.display();
		
	}
}
