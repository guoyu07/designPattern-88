package ���ģʽ;
/*
 * Leaf ������б�ʾҶ�ӽڵ����Ҷ�ڵ�û���ӽڵ㡣��
 * ����Ҷ�ڵ�û�������ӷ�֧����Ҷ������add��remove����ʵ����û�����壬
 * ����������������Ҷ�ڵ��֧�ڵ�����ڳ����ε��������Ǿ߱���ȫһ�µĽӿڡ�
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
