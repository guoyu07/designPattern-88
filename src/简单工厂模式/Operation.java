package 简单工厂模式;

public abstract class Operation implements Operational{
	private double numberA;
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	public double getNumberA() {
		return numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	private double numberB;

	@Override
	public abstract double getResult() ;
	

}
