package ������ģʽ;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ۼ�����
		ConcreteAggregate aggregate=new ConcreteAggregate(6);
		String [] a=aggregate.getAggregates();
		a[0]="�˿�1";
		a[1]="�˿�2";
		a[2]="�˿�3";
		a[3]="�˿�4";
		a[4]="�˿�5";
		a[5]="�˿�6";
		
		//����Դ���� Iterator i=new ConcreteIterator();���Ҿ�����������ġ�������
		Iterator i=aggregate.createIterator();
		
		Object item=i.first();
		while(!i.isDone()){
			System.out.println(i.currentItem()+"   ����Ʊ");
			i.next();
		}
		
		
	}

}
