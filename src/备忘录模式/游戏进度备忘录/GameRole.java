package ����¼ģʽ.��Ϸ���ȱ���¼;

public class GameRole {
	private int vit;//����ֵ
	private int atk;//������
	private int def;//������
	
	//��ʼ����Ϸ��ɫ״̬
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
	//��ʾ��Ϸ��ɫ��ǰ״̬
	public void display(){
		System.out.println("��ǰ��Ϸ��ɫ��״̬�� vit��"+vit+" atk:"+atk+" def:"+def);
	}
	
	//�����ɫ״̬
	public RoleStateMemento getGameRole(){
		return new RoleStateMemento(vit,atk,def);
		
	}
	//�ָ���ɫ״̬
	public void recoveryState(RoleStateMemento memento){
		vit=memento.getVit();
		atk=memento.getAtk();
		def=memento.getDef();
	}
}
