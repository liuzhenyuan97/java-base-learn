package arrayList;

import java.util.*;

import inheritance.Employee;

/**
 * 这程序说明泛型数组类
 * @author liuzhenyuan
 *
 */

public class ArrayListTest {

	public static void main(String[] args){
		//让staff 泛型数组获得三个对象
		ArrayList<Employee> staff = new ArrayList<>();
		
		staff.add(new Employee("Carl Crack",75000, 1987, 12, 15));
		staff.add(new Employee("Harry Hacker",50000, 1989, 10, 1));
		staff.add(new Employee("Tony Tester",40000, 1990, 3, 15));
		
		//提升每个人工资5%
		for(Employee e : staff)
			e.raiseSalary(5);
		
		//打印关于每个对象的信息
		for(Employee e : staff)
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + "hireday=" + e.getHireDay());
		
	}
	
	
}
