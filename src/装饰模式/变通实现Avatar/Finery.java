package װ��ģʽ.��ͨʵ��Avatar;
//�����ࣨDecorator��
public class Finery extends Person{
	protected Person component;
	
	//���
	public void decorate(Person component){
		this.component=component;
	}
	//show
	public void show(){
		if(component!=null){
			component.show();
		}
	}

}
