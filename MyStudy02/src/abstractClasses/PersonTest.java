package abstractClasses;
/**
 * 这程序说明抽象类
 * @author liuzhenyuan
 *
 */
public class PersonTest {

	public static void main(String[] args){
		Person[] people = new Person[2];
		
		//学生对象和雇员对象填满人的数组
		people [0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		people [1] = new Student("Maria Morris","computer science");
		
		//打印人对象的名字和说明
		for (Person p : people)
			System.out.println(p.getName() + "," + p.getDescription());
	}
	
}
