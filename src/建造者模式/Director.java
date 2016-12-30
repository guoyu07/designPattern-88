package 建造者模式;

public class Director {
	//用来指挥建造过程
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
