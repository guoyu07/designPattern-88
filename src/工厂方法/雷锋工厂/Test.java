package ��������.�׷湤��;

public class Test {
    public static void main(String[] args) {
		//��������ģʽ
    	LeiFacory facory=new UndergraduateFactory();
    	LeiFeng student=facory.createLeiFeng();
    	student.buyRice();
    	student.sweep();
    	student.wash();
	}
}
