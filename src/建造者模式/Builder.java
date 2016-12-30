package 建造者模式;

public abstract class Builder {
	public abstract void buildPartA();
	public abstract void buildPartB();
	//我觉得建造者模式的这个方法和在实现类里组合返回的产品类是亮点
	public abstract Product getResult();
	
}
