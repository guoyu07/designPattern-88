package ���ģʽ.��˾����ϵͳ;

public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		System.out.println(getSign(depth)+name);
	}

	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		System.out.println(name+":    ��˾������֧����");
	}

}
