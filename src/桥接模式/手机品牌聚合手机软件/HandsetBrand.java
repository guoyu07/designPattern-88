package 桥接模式.手机品牌聚合手机软件;

public abstract class HandsetBrand {
	protected HandsetSoft soft;
	
	//品牌需要关注软件，所以可以在机器中安装软件（setSoft），以备运行
	public void setSoft(HandsetSoft soft) {
		this.soft = soft;
	}
	
	public abstract void run();
}
