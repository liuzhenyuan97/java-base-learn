package inheritance;
import java.time.*;
/**
 * 这程序构建Employee的相关方法和类
 * @author liuzhenyuan
 *
 */
public class Employee {

	private String name;
	private double salary;
	private LocalDate hireDay; //雇佣日
	
	public Employee(String name,double salary,int year, int month, int day){
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
	
}
