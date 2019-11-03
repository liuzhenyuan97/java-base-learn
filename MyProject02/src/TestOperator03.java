
/**
 * 测试逻辑运算符
 * @author liuzhenyuan
 *
 */
public class TestOperator03 {
   
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&b2);
		System.out.println(b1|b2);
		System.out.println(b1^b2);
		System.out.println(!b2);
		
		
		//短路
	    //	int c = 3/0;
		boolean b3 = 1>2&&2<(3/0);  //短路与，&&前面是false 则后面不计算。与运算的话，则会计算后面，报错。
		System.out.println(b3);
		
		

		
	}
	
}
