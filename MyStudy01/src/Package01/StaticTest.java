package Package01;
/**
 * 测试静态方法 static methods
 * @author liuzhenyuan
 *
 */



public class StaticTest {

	public static void main(String[] args){
		
		
		
		//三个员工数组
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tom",40000);
		staff[1] = new Employee("Dick",60000);
		staff[2] = new Employee("Harry",65000);
		
		
		for(Employee e : staff){
		
			e.setId();
			System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
			
		}
		
		int n = Employee.getNextId();
		System.out.println("Next available id=" +n);
		
	}
	
}

class Employee{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n,double s){
		name = n;
		salary = s;
		id = 0;		
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(){
		id = nextId;//设置下一个id
		nextId++;
	}
	
	public static int getNextId(){
		return nextId;//返回静止域
	}
	
	public static void main(String[] args){
		Employee e = new Employee("Harry",50000);
		System.out.println(e.getName()+" " + e.getSalary());
	}
	
}
