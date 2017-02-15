package 访问者模式;
/*
 * 能枚举它的元素，可以提供一个高层的接口以允许访问者访问它的元素。
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
