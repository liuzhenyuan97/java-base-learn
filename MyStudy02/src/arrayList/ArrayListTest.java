package arrayList;

import java.util.*;

import inheritance.Employee;

/**
 * �����˵������������
 * @author liuzhenyuan
 *
 */

public class ArrayListTest {

	public static void main(String[] args){
		//��staff ������������������
		ArrayList<Employee> staff = new ArrayList<>();
		
		staff.add(new Employee("Carl Crack",75000, 1987, 12, 15));
		staff.add(new Employee("Harry Hacker",50000, 1989, 10, 1));
		staff.add(new Employee("Tony Tester",40000, 1990, 3, 15));
		
		//����ÿ���˹���5%
		for(Employee e : staff)
			e.raiseSalary(5);
		
		//��ӡ����ÿ���������Ϣ
		for(Employee e : staff)
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + "hireday=" + e.getHireDay());
		
	}
	
	
}
