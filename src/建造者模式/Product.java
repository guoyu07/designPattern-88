package ������ģʽ;

import java.util.ArrayList;
import java.util.List;

public class Product {
	List<String> parts=new ArrayList<>();
	//��Ӳ�Ʒ����
	public void add(String part){
		parts.add(part);
	}
	//show
	public void show (){
		System.out.println("��Ʒ ����-----");
		for(String part:parts)
			System.out.print(part);
	}

}
