package ������ģʽ;

public class ConcreteBuilder1 extends Builder{
	private Product product=new Product();
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("����a");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("����b");
	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
