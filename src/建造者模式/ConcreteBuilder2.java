package 建造者模式;

public class ConcreteBuilder2 extends Builder{
	private  Product product=new Product();
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("部件 a2");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("部件 b2");
	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}
	
}
