package 备忘录模式.游戏进度备忘录;

public class RoleStateMemento  {
	private int vit;
	private int atk;
	private int def;
	public RoleStateMemento(int vit, int atk, int def) {
		super();
		this.vit = vit;
		this.atk = atk;
		this.def = def;
	}
	public int getVit() {
		return vit;
	}
	public int getAtk() {
		return atk;
	}
	public int getDef() {
		return def;
	}
	
}
