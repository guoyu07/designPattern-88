package 策略模式;

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
		 
		 //使用策略模式的类只需要与 CashContext交互就可以了，不需要了解具体细节，
		 //这样使用者与被使用者达到了耦合的效果
		 double total=new CashContext(type).getResult(amount*price);
		 System.out.println(total);
	}
}
