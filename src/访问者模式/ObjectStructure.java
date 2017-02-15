package ������ģʽ;
/*
 * ��ö������Ԫ�أ������ṩһ���߲�Ľӿ�����������߷�������Ԫ�ء�
 */

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Element> elements=new ArrayList<>();
	
	public void detach(Element element){
		elements.remove(element);
	}
	
	public void attach(Element element){
		elements.add(element);
	}
	
	public void accept(Visitor visitor){
		for(Element e : elements)
			e.accept(visitor);
	}
}
