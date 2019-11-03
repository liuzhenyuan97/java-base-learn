

public class SxtStu {

	//属性field
	int id;
	String name;
	int age;
	Computer comp;//计算机
	
	
	//方法
	void study(){
		System.out.println("我在学习！使用电脑："+comp.brand);
	}
	//构造方法，用于创建这个类的对象。无参数的构造方法可以由系统自动创建。
	SxtStu(){
		
	}
	
	//程序执行入口，必须要有，main
	public static void main(String[] args){
		SxtStu stu = new SxtStu();//创建一个对象
		stu.name = "liu";
		Computer comp1 = new Computer();		
		comp1.brand = "联想";
		stu.comp = comp1 ;
		stu.study();
		
	}

}
class Computer {
	String brand;
}
