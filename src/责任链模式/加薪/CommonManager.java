package ������ģʽ.��н;
/*
 * ����
 */
public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reqeustApplication(Request reqeust) {
		// TODO Auto-generated method stub
		if(reqeust.getRequestType().equals("���")&&reqeust.getNumber()<=2){
			System.out.println(name+" :  "+reqeust.getRequestContent()+" ����׼��");
		}else{
			if (superior!=null) {
			superior.reqeustApplication(reqeust);
			}
		}
	}

}
