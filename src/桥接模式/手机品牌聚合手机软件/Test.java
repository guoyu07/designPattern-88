package �Ž�ģʽ.�ֻ�Ʒ�ƾۺ��ֻ����;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandsetBrand ab=new HandsetBrandA();
		
		ab.setSoft(new HandsetGame());
		ab.run();
		
		ab.setSoft(new HandsetAddressList());
		ab.run();
		
		ab=new HandsetBrandB();
		
		ab.setSoft(new HandsetGame());
		ab.run();
		
		ab.setSoft(new HandsetAddressList());
		ab.run();
	}

}
