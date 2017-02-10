package 责任链模式.加薪;

public class GeneralManager extends Manager{

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reqeustApplication(Request reqeust) {
		// TODO Auto-generated method stub
		if(reqeust.getRequestType().equals("请假")){
			System.out.println(name+" :" +reqeust.getRequestContent()+" 被批准");
		}else if(reqeust.getRequestType().equals("加薪")&&reqeust.getNumber()<=500){
			System.out.println(name+" :" +reqeust.getRequestContent()+" 被批准");
		}else if(reqeust.getRequestType().equals("加薪")&&reqeust.getNumber()>500){
			System.out.println(name+" :" +reqeust.getRequestContent()+" 等等再说吧");
		}else if(superior==null){
			System.out.println(" 待定");
		}else{
			superior.reqeustApplication(reqeust);
		}
	}

}
