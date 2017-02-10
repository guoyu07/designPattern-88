package 责任链模式;
/*
 * 定义一个处理请求的接口
 */
public abstract class Handler {
	protected Handler successor;
	
	//设置请求的下一个处理者
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	//处理请求的抽象方法
	public abstract void handleRequest(int request);
	
}
