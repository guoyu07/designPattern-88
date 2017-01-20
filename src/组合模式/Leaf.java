package 组合模式;
/*
 * Leaf 在组合中表示叶子节点对象，叶节点没有子节点。。
 * 由于叶节点没有再增加分支和树叶，所以add和remove方法实现它没有意义，
 * 但这样做可以消除叶节点和支节点对象在抽象层次的区别，他们具备完全一致的接口。
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		System.out.println("cannot add to a leaf");
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		System.out.println("cannot remove from a leaf");
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		String show="";
		for(int i=0;i<depth;i++)
			show+="-";
		System.out.println(show+name);
	}

}
