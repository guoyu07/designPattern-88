package в╟йндёй╫;

public abstract class Decorator extends Component{
	protected Component component;
	public void setComponent(Component component){
		this.component=component;
	}
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		if(component!=null){
			component.operation();
		}
	}
	
}
