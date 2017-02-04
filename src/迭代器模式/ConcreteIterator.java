package ������ģʽ;
/*
 * ����������࣬�̳�Iterator
 */
public class ConcreteIterator implements Iterator{
	//���������ۼ�����
	private String[] aggregates;
	private int current=0;
	
	//��ʼ��ʱ������ľۼ�������
	public ConcreteIterator( String[] aggregates) {
		// TODO Auto-generated constructor stub
		this.aggregates=aggregates;
	}	
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return aggregates[0];
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object ret=null;
		current++;
		if(current<aggregates.length)
			ret=aggregates[current];
		return ret;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current<aggregates.length?false:true;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return aggregates[current];
	}

}
