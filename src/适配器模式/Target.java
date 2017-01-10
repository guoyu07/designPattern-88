package 适配器模式;
/*
 * 这是客户所期待的接口。目标可以是具体的类或是抽象的类，也可以 是接口。
 */
public  class Target {
	public    void  request(){
		System.out.println("普通请求");
	}
            
}
