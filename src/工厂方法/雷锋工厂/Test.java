package 工厂方法.雷锋工厂;

public class Test {
    public static void main(String[] args) {
		//工厂方法模式
    	LeiFacory facory=new UndergraduateFactory();
    	LeiFeng student=facory.createLeiFeng();
    	student.buyRice();
    	student.sweep();
    	student.wash();
	}
}
