package com.lzy.test;

/**
 * 测试自动装箱，拆箱
 * @author liuzhenyuan
 *
 */
public class TestAutoBox {
	public static void main(String[] args){
		Integer a = 234;//自动装箱：Integer a = Integer.valuaOf(234);
		int b = a;      //自动拆箱：int b = a.intValue();
		
		Integer c = null;
		if(c!=null){
		int d = c;
		}                //自动拆箱：调用了：c.intValue
		
		
		//缓存[-128,127]之间的数字。实际就是系统初始的时候，创建了[-128,127]
		//当我调用ValueOf()的时候，直接在这个范围之内拿来用。
		Integer in1 = Integer.valueOf(-128);
		Integer in2 = -128;
		System.out.print(in1==in2);//true 因为内存-128在缓存范围内
		System.out.println(in1.equals(in2));//true
		System.out.println("######################");
		Integer in3 = 1234;
		Integer in4 = 1234;
		System.out.print(in3==in4);//false
		System.out.println(in3.equals(in4));//true
	}

}
