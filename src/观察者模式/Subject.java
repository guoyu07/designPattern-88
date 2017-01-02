package 观察者模式;
//聚集所有观察者的引用，每个主题都可以有任何数量的观察者。
//抽象主题提供一个接口，可以增加和删除观察者对象

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers=new LinkedList<>();
	
	//增加观察者
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	//移除观察者
	public void detach(Observer  observer){
		observers.remove(observer);
	}
	
	//通知
	public void notify1(){
		for( Observer o: observers){
			o.update();
		}
	}
}
