package 观察者模式;
//为所有具体观察者定义一个接口，在得到主题通知时更新自己。这个方法接口叫做更新接口。
//抽象观察者一般用一个抽象类或者一个接口实现。
//更新接口通常包含一个update（）方法，这个方法叫做更新方法
public abstract class Observer {
	public abstract void update();
}
