package 责任链模式.加薪;
/*
 * 经理
 */
public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reqeustApplication(Request reqeust) {
		// TODO Auto-generated method stub
		if(reqeust.getRequestType().equals("请假")&&reqeust.getNumber()<=2){
			System.out.println(name+" :  "+reqeust.getRequestContent()+" 被批准。");
		}else{
			if (superior!=null) {
			superior.reqeustApplication(reqeust);
			}
		}
	}

}
