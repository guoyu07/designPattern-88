package 备忘录模式.游戏进度备忘录;

public class GameRole {
	private int vit;//生命值
	private int atk;//攻击力
	private int def;//防御力
	
	//初始化游戏角色状态
	public void initState(){
		vit=100;
		atk=100;
		def=100;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public void setDef(int def) {
		this.def = def;
	}
	//显示游戏角色当前状态
	public void display(){
		System.out.println("当前游戏角色的状态： vit："+vit+" atk:"+atk+" def:"+def);
	}
	
	//保存角色状态
	public RoleStateMemento getGameRole(){
		return new RoleStateMemento(vit,atk,def);
		
	}
	//恢复角色状态
	public void recoveryState(RoleStateMemento memento){
		vit=memento.getVit();
		atk=memento.getAtk();
		def=memento.getDef();
	}
}
