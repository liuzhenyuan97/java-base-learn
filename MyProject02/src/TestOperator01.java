/**
 * 测试算数运算符
 * @author liuzhenyuan
 *
 */
public class TestOperator01 {
    
	public static void main(String[] args){
		/*
		byte  a  = 1;
		short b  = 2;
		int   c  = 3;
		long  d  = 4;
		//byte e  = a + b;  //报错 默认为int 内存不足，报错
		//int  c2 = c + d； //报错 long不可以赋值给int 报错
		
		float x  =  1.5f;
		//float y =  x + 1.5;  //报错1.5默认是double 无法赋值给float。
		*/
		
		/*
		//测试自增自减
		int a = 1;
		int b = ++a;//先增加再赋值
		System.out.println("a="+a+"\nb="+b);
		a = 1;
		b = a++;//赋值再自增
		System.out.println("a="+a+"\nb="+b);
		*/
		
		int a = 3;
		int b = 4;
		a+=b;//   ==>  a=a+b
		System.out.println("a="+a+"\nb="+b);
		a*=b+3;// ==> a=a*(b+3)
		System.out.println("a="+a+"\nb="+b);//49  a=a+b=4+3=7 a=7 a=a*(b+3)=7*(4+3)
		
	}
	
}
