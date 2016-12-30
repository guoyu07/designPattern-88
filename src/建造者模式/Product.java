package 建造者模式;

import java.util.ArrayList;
import java.util.List;

public class Product {
	List<String> parts=new ArrayList<>();
	//添加产品部件
	public void add(String part){
		parts.add(part);
	}
	//show
	public void show (){
		System.out.println("产品 创建-----");
		for(String part:parts)
			System.out.print(part);
	}

}
