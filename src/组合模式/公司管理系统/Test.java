package ���ģʽ.��˾����ϵͳ;

public class Test {
	public static void main(String[] args) {
		ConcreteCompany root=new ConcreteCompany("�����ܹ�˾");
		root.add(new HrDepartment("�ܹ�˾������Դ��"));
		root.add(new FinanceDepartment("�ܹ�˾����"));
		
		ConcreteCompany comp=new ConcreteCompany("�Ϻ������ֹ�˾");
		comp.add(new HrDepartment("�����ֹ�˾������Դ��"));
		comp.add(new FinanceDepartment("�����ֹ�˾����"));
		root.add(comp);
		
		ConcreteCompany comp1=new ConcreteCompany("�Ͼ����´�");
		comp1.add(new HrDepartment("�Ͼ����´�������Դ��"));
		comp1.add(new FinanceDepartment("�Ͼ����´�����"));
		root.add(comp1);
		
		ConcreteCompany comp2=new ConcreteCompany("���ݰ��´�");
		comp2.add(new HrDepartment("���ݰ��´�������Դ��"));
		comp2.add(new FinanceDepartment("���ݰ��´�����"));
		root.add(comp2);
		
		System.out.println("�ṹͼ��");
		root.display(1);
		
		System.out.println("ְ�� ");
		root.lineOfDuty();
		
		
	}
}
