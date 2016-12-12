package 简单工厂模式;

public class OperationFactory {
	public static Operation createOperation(String operate){
		Operation ret=null;
		switch(operate){
		case "+":
			ret=new OperationAdd();
			break;
		case "-":
			ret=new OperationSub();
			break;
		case "*":
			ret=new OperationMul();
			break;
		case "/":
			ret=new OperationDiv();
			break;
		}
		return ret;
	}
}
