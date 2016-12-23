package 工厂方法.雷锋工厂;
//学习雷锋的大学生工厂
public class UndergraduateFactory implements LeiFacory{

	@Override
	public LeiFeng createLeiFeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}
}
