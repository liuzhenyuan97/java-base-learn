package com.lzy.test;

/**
 * 测试可变字符序列和不可变字符序列使用的陷进
 * @author liuzhenyuan
 *
 */
public class TestStringBuilder3 {
	public static void main(String[] args){
		
		/*使用String字符串拼接*/
		String sb = "";
		long time1 = System.currentTimeMillis();//获取系统当前时间
		long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<5000;i++){
			sb = sb+1; //相当于产生了10000个对象
		}
		long time2 = System.currentTimeMillis();
		long num2 = Runtime.getRuntime().freeMemory();
		System.out.println("String占用内存："+(num1-num2));
		System.out.println("String占用时间："+(time2-time1));
		
		StringBuilder sb2 = new StringBuilder("");
		long time3 = System.currentTimeMillis();//获取系统当前时间
		long num3 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
			for(int i=0;i<5000;i++){
				sb2.append(i);
			}
		long time4 = System.currentTimeMillis();
		long num4 = Runtime.getRuntime().freeMemory();
		System.out.println("String占用内存："+(num3-num4));
		System.out.println("String占用时间："+(time4-time3));
		
	}

}
