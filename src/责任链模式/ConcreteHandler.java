package 责任链模式;
/*
 * 具体处理着类，处理它所负责的请求，可访问它的后继者，如果可处理该请求，就处理之，
 * 否则就将该请求转发给它的后继者。。。。
 * 
 * 当请求数在0到10之间则有权处理，否则转到下一位。。。
 */
public class ConcreteHandler extends Handler{
	
	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>=0&&request<=10){
			System.out.println(this.getClass().getName()+" 处理了 "+request+" 号贵宾的请求");
		}else{
			successor.handleRequest(request);
		}
	}

}
