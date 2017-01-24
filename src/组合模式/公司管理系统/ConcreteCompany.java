package 组合模式.公司管理系统;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company{

		private List<Company> children=new ArrayList<>();
		
		public ConcreteCompany(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void add(Company company) {
			// TODO Auto-generated method stub
			children.add(company);
		}

		@Override
		public void remove(Company company) {
			// TODO Auto-generated method stub
			children.remove(company);
		}

		@Override
		public void display(int depth) {
			// TODO Auto-generated method stub
			System.out.println(getSign(depth)+name);
			for(Company company:children)
				company.display(depth+2);
		}
		

		@Override
		public void lineOfDuty() {
			// TODO Auto-generated method stub
			for(Company company:children)
				company.lineOfDuty();
		}
		
}
