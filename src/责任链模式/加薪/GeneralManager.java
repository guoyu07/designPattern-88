package ������ģʽ.��н;

public class GeneralManager extends Manager{

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reqeustApplication(Request reqeust) {
		// TODO Auto-generated method stub
		if(reqeust.getRequestType().equals("���")){
			System.out.println(name+" :" +reqeust.getRequestContent()+" ����׼");
		}else if(reqeust.getRequestType().equals("��н")&&reqeust.getNumber()<=500){
			System.out.println(name+" :" +reqeust.getRequestContent()+" ����׼");
		}else if(reqeust.getRequestType().equals("��н")&&reqeust.getNumber()>500){
			System.out.println(name+" :" +reqeust.getRequestContent()+" �ȵ���˵��");
		}else if(superior==null){
			System.out.println(" ����");
		}else{
			superior.reqeustApplication(reqeust);
		}
	}

}
