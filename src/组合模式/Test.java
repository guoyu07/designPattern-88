package 组合模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//生成树根root，根上长出两叶LeafA和LeafB
		Composite root=new Composite("root");
		root.add(new Leaf("leaf a"));
		root.add(new Leaf("leaf b"));
		
		//根上长出分支composite x，分支上也有两叶Leaf xa和Leaf xb
		Composite  comp=new Composite("composite X");
		comp.add(new Leaf("leaf xa"));
		comp.add(new Leaf("leaf xb"));
		root.add(comp);
		
		//在compositex上再长出分支compositexy，分支上也有两叶leafxya和leafxyb
		Composite comp2 =new Composite("composite xy");
		comp.add(new Leaf("leaf xya"));
		comp.add(new Leaf("leaf xyb"));
		comp.add(comp2);
		
		//根部又长出两叶子 Leaf c和leaf d，可惜leafd没长牢，被风吹走了
		root.add(new Leaf("leaf c"));
		Leaf leaf=new Leaf("leaf d");
		root.add(leaf);
		root.remove(leaf);
		
		//显示大树的样子
		root.display(1);
		
	}

}
