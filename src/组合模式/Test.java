package ���ģʽ;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������root�����ϳ�����ҶLeafA��LeafB
		Composite root=new Composite("root");
		root.add(new Leaf("leaf a"));
		root.add(new Leaf("leaf b"));
		
		//���ϳ�����֧composite x����֧��Ҳ����ҶLeaf xa��Leaf xb
		Composite  comp=new Composite("composite X");
		comp.add(new Leaf("leaf xa"));
		comp.add(new Leaf("leaf xb"));
		root.add(comp);
		
		//��compositex���ٳ�����֧compositexy����֧��Ҳ����Ҷleafxya��leafxyb
		Composite comp2 =new Composite("composite xy");
		comp.add(new Leaf("leaf xya"));
		comp.add(new Leaf("leaf xyb"));
		comp.add(comp2);
		
		//�����ֳ�����Ҷ�� Leaf c��leaf d����ϧleafdû���Σ����紵����
		root.add(new Leaf("leaf c"));
		Leaf leaf=new Leaf("leaf d");
		root.add(leaf);
		root.remove(leaf);
		
		//��ʾ����������
		root.display(1);
		
	}

}
