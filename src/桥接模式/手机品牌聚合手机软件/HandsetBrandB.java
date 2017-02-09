package 桥接模式.手机品牌聚合手机软件;

public class HandsetBrandB extends HandsetBrand{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("品牌B：   ");
		soft.run();
	}

}
