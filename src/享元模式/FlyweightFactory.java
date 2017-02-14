package 享元模式;
/*
 * 是一个享元工厂，用来创建管理Flyweight对象。它主要是用来确保合理地共享Flyweight，当用户请求Flyweight时
 * Flyweightfactory对象提供一个已创建的实例或创建一个（如果不存在的话）
 */

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String, Flyweight> flyweights=new HashMap<>();
	
	//先生成3个实例
	public FlyweightFactory() {
		// TODO Auto-generated constructor stub
		flyweights.put("a", new ConcreteFlyweight());
		flyweights.put("b", new ConcreteFlyweight());
		flyweights.put("c", new ConcreteFlyweight());
	}
	
	//根据请求获得已生成的实例
	public Flyweight getFlyweight(String key){
		if(flyweights.get(key)==null){
			flyweights.put(key, new ConcreteFlyweight());
		}
		return flyweights.get(key);
	}
}
