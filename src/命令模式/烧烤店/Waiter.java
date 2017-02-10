package ����ģʽ.�տ���;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
		//ʱ��������ӣ�http://www.cnblogs.com/minisculestep/archive/2015/10/25/4908368.html
		Date date=new Date(0);
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("ȡ��������"+command.toString()+"ȡ��ʱ�䣺"+sdf.format(date));
	}
	
	//֪ͨȫ��ִ��
	public void notice(){
		for(Command command:orders){
			command.executeCommand();
		}
	}
}
