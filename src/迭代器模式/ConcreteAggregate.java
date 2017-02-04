package µü´úÆ÷Ä£Ê½;

public class ConcreteAggregate implements Aggregate {
	
	private String[] aggregates;
	 
	public ConcreteAggregate(int n) {
		// TODO Auto-generated constructor stub
		aggregates=new String[n];
	}
	public void setAggregates(String[] aggregates) {
		this.aggregates = aggregates;
	}
	public String[] getAggregates() {
		return aggregates;
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(aggregates);
	}

}
