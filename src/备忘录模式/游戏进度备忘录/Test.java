package ����¼ģʽ.��Ϸ���ȱ���¼;

public class Test {
	public static void main(String[] args) {
		//��սbossǰ
		GameRole lo=new GameRole();
		lo.initState();
		lo.display();
		
		//������ȣ����ڷ�װ��memento�У�������ǲ���֪����������Щ����Ľ�ɫ����
		RoleStateMemento memento=lo.getGameRole();
		RoleStateCaretaker stateAdmin=new RoleStateCaretaker();
		stateAdmin.setMemento(memento);
		
		//��սbossʱ���������
		lo.setAtk(0);
		lo.setDef(0);;
		lo.setVit(0);
		lo.display();
		
		//�ָ���սbossǰ״̬
		lo.recoveryState(stateAdmin.getMemento());
		lo.display();
		
	}
}
