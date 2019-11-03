package equals;

import java.time.*;
import java.util.Objects;

public class Employee {
	
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day){
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public LocalDate getHireDay(){
		return hireDay;
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public boolean equals(Object otherObject){
		//快速测试查看对象是否相同
		if (this == otherObject)
			return true;
		
		//如果为null 必须返回假 false
		if (otherObject == null)
			return false;
		
		//如果类不匹配，它们就不相等
		if (getClass() != otherObject.getClass())
			return false;
		
		//我们知道其他对象是一个非空 Employee 对象
		Employee other = (Employee) otherObject;
		
		//测试字符是否具有相同的值
		return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
	}
	
	public int hashCode(){
		return Objects.hash(name, salary, hireDay);
	}
	
	public String toSprint(){
		return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
	}
	

}
