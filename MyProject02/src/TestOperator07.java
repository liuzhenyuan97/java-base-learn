/**
 * 测试类型转化
 * @author liuzhenyuan
 *
 */
public class TestOperator07 {
   
	public static void main(String[] args){
		
		int a = 324;
		long b = a;
		double c = b;
		//a = b;  long 不能赋值给 int
		//long e = 3.23F;   float 不能赋值给 long
		float f = 2345678L;
		
		
		//特例
		byte b2 = 123;  //byte short int 可以直接赋值整数。
		
		double x = 3.99;
		int y = (int) x; //强制转换 double==>int 精度舍去
		char z = 'a';
		int k = z+1;
		System.out.println(y);
		System.out.println(k);
		System.out.println((char)k);

		
	}
	
}
