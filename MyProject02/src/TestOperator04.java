
/**
 * 位运算符
 * @author liuzhenyuan
 *
 */
public class TestOperator04 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);

		//移位运算 左移 >>1 一位除以2 右移 << 2 二位除以2*2，除以4
		int c = 3<<2;
		System.out.println(c);
		System.out.println(12>>1);
		
	}
	
}
