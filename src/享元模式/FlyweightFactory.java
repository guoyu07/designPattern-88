package ��Ԫģʽ;
/*
 * ��һ����Ԫ������������������Flyweight��������Ҫ������ȷ������ع���Flyweight�����û�����Flyweightʱ
 * Flyweightfactory�����ṩһ���Ѵ�����ʵ���򴴽�һ������������ڵĻ���
 */

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String, Flyweight> flyweights=new HashMap<>();
	
	//������3��ʵ��
	public FlyweightFactory() {
		// TODO Auto-generated constructor stub
		flyweights.put("a", new ConcreteFlyweight());
		flyweights.put("b", new ConcreteFlyweight());
		flyweights.put("c", new ConcreteFlyweight());
	}
	
	//���������������ɵ�ʵ��
	public Flyweight getFlyweight(String key){
		if(flyweights.get(key)==null){
			flyweights.put(key, new ConcreteFlyweight());
		}
		return flyweights.get(key);
	}
}
