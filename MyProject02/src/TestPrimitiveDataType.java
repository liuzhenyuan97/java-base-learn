/**
 * 测试基本数据类型 （整型常量）
 * @author liuzhenyuan
 *
 */
public class TestPrimitiveDataType {

	public static void main(String[] args) {
		//测试整型变量
		int a = 15;
		int b = 015;  //以0开头，八进制
		int c = 0x15; //以0x或0X开头，十六进制
		int d = 0b1101; //以0b或者0B开头，二进制
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		byte age = 30;
		short salary = 30000;
		int population = 2000000000;   //默认整型常量是int类型
		long globalPopulation = 7400000000L;//后面加L就是这事一个long类型的常量，数据后+l或L。
		
		
		
		
	}
	
}
