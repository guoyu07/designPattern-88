package ²ßÂÔÄ£Ê½;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("please input price per one");
		 double price=sc.nextDouble();
		 System.out.println("please input amount");
		 int amount =sc.nextInt();
		 
		 System.out.println("choise today's activity:"+"normal;		full300minus100;		20%off");
		 String type=sc.next();
		 
		 System.out.println("should pay:");
		 double total=new CashContext(type).getResult(amount*price);
		 System.out.println(total);
	}
}
