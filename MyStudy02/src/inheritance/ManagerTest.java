package inheritance;

/**
 * 这程序说明继承（遗传）
 * @author liuzhenyuan
 *
 */
public class ManagerTest {
	
	public static void main(String[] args){
	
		Manager boss = new Manager("Carl Cracker", 80000,1987, 12, 15);//创建一个boss对象
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		
		//设置老板的数组对象
		
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);
		
		//打印所有员工对象信息
		for(Employee e : staff)
			System.out.println("name=" + e.getName() +" " + "salary=" + e.getSalary() +" "+ "hireDay=" + e.getHireDay());
	}
	
}
