package �򵥹���ģʽ;

public class OperationDiv extends Operation{



	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		if(getNumberB()==0)
			try {
				throw new Exception("��������Ϊ0");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return getNumberA()/getNumberA();
	}

}
