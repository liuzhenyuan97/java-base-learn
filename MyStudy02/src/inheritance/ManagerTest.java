package inheritance;

/**
 * �����˵���̳У��Ŵ���
 * @author liuzhenyuan
 *
 */
public class ManagerTest {
	
	public static void main(String[] args){
	
		Manager boss = new Manager("Carl Cracker", 80000,1987, 12, 15);//����һ��boss����
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		
		//�����ϰ���������
		
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
		
		//��ӡ����Ա��������Ϣ
		for(Employee e : staff)
			System.out.println("name=" + e.getName() +" " + "salary=" + e.getSalary() +" "+ "hireDay=" + e.getHireDay());
	}
	
}
