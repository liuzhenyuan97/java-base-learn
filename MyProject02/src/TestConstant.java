/**
 * 测试常量
 * @author liuzhenyuan
 *
 */
public class TestConstant {
    
   public static void main(String[] args) {
	  
	   int age = 18;
	   final String name = "liu"; 
	   // name = "liu"; name不能再被赋。
	   
	   final double PI = 3.14;
	   //PI = 3.1415; 不能再被赋值，常量PI。
	   double r = 4;
	   double area = PI * r * r;
	   double circle = 2 * PI * r;
	   System.out.println("area= " + area);
	   System.out.println("circle= " + circle);
	   
	
}
	
	
}
