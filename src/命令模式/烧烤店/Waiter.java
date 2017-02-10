package ����ģʽ.�տ���;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Waiter {
	//���Ӵ�ž������������
	private List<Command>orders=new ArrayList<>();
	
	//���ö���
	public void setOrder(Command command){
		//�ڿͻ��������ʱ����û�����տ����лؾ�
		if(command.getClass().getModifiers()==orders.size()+100000000){
			System.out.println("����Ŀ���첻���ӣ�����");
		}else{
			orders.add(command);
		}
	}
	
	//ȡ������
	public void cancelOrder(Command command){
		orders.remove(command);
		//ʱ��������ӣ�http://blog.csdn.net/chenleixing/article/details/44408875
		
		System.out.println("ȡ��������"+command.toString()+"ȡ��ʱ�䣺"+LocalDateTime.now());
	}
	
	//֪ͨȫ��ִ��
	public void notice(){
		for(Command command:orders){
			command.executeCommand();
		}
	}
}
