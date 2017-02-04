package 迭代器模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//公交车聚集对象
		ConcreteAggregate aggregate=new ConcreteAggregate(6);
		String [] a=aggregate.getAggregates();
		a[0]="乘客1";
		a[1]="乘客2";
		a[2]="乘客3";
		a[3]="乘客4";
		a[4]="乘客5";
		a[5]="乘客6";
		
		//书中源码是 Iterator i=new ConcreteIterator();，我觉得是有问题的。。。。
		Iterator i=aggregate.createIterator();
		
		Object item=i.first();
		while(!i.isDone()){
			System.out.println(i.currentItem()+"   请买票");
			i.next();
		}
		
		
	}

}
