package 简单工厂模式;

public class OperationDiv extends Operation{



	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		if(getNumberB()==0)
			try {
				throw new Exception("除数不能为0");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return getNumberA()/getNumberA();
	}

}
