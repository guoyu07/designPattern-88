package 组合模式;

import java.util.ArrayList;
import java.util.List;

/*
 * 定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关的操作，
 * 比如增加add和删除remove
 */
public class Composite extends Component{
	//一个子对象集合用来存储其下属的枝节点和叶节点
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
