package 简单工厂模式;

public class OperationAdd extends Operation {



	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		return getNumberA()+getNumberB();
	}

}
