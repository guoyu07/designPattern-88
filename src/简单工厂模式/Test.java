package 简单工厂模式;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please put your first number");
		double numberA=sc.nextDouble();
		
		System.out.println("please put your operation");
		String operation=sc.next();
		
		System.out.println("please put your second number");
		double numberB=sc.nextDouble();
		
		Operation operational=OperationFactory.createOperation(operation);
		operational.setNumberA(numberA);
		operational.setNumberB(numberB);
		
		System.out.println(numberA+operation+numberB+" = "+operational.getResult());
	}

}
