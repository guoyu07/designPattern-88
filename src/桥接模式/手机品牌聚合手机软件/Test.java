package 桥接模式.手机品牌聚合手机软件;

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
