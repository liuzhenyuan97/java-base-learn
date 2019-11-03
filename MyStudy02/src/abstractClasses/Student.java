package abstractClasses;

public class Student extends Person {

	private String major;
	
	/**
	 * @param name the student's name
	 * @param major the student's major
	 */
	public Student (String name,String major){
		//超类建设
		super(name);
		this.major = major;
	}
	
	public String getDescription(){
		return "一个学生主修的是"+ major;
	}
}
