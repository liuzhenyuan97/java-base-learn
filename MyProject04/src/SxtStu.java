

public class SxtStu {

	//����field
	int id;
	String name;
	int age;
	Computer comp;//�����
	
	
	//����
	void study(){
		System.out.println("����ѧϰ��ʹ�õ��ԣ�"+comp.brand);
	}
	//���췽�������ڴ��������Ķ����޲����Ĺ��췽��������ϵͳ�Զ�������
	SxtStu(){
		
	}
	
	//����ִ����ڣ�����Ҫ�У�main
	public static void main(String[] args){
		SxtStu stu = new SxtStu();//����һ������
		stu.name = "liu";
		Computer comp1 = new Computer();		
		comp1.brand = "����";
		stu.comp = comp1 ;
		stu.study();
		
	}

}
class Computer {
	String brand;
}
