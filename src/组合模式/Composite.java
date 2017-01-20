package ���ģʽ;

import java.util.ArrayList;
import java.util.List;

/*
 * ������֦�ڵ���Ϊ�������洢�Ӳ�������Component�ӿ���ʵ�����Ӳ����йصĲ�����
 * ��������add��ɾ��remove
 */
public class Composite extends Component{
	//һ���Ӷ��󼯺������洢��������֦�ڵ��Ҷ�ڵ�
	private List <Component> children =new ArrayList<>();
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		children.remove(component);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		String show="";
		for(int i=0;i<depth;i++)
			show+="-";
		System.out.println(show+name);
		for(Component component:children)
			component.display(depth+2);
	}
	

}
