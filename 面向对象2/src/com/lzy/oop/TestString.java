package com.lzy.oop;

/**
 * 测试字符串的基本用法
 * @author liuzhenyuan
 *
 */
public class TestString {
	public static void main(String[] args){
		String str = "abc";
		//String不可变字符串
		String str2 = new String("def");
		String str3 = "abc" + "defgh";
		String str4 = "18"+19;  //不是加法，是连接符
		System.out.println(str4);//1819
		
		System.out.println("#################");
		String str10 = "gaoqi";//常量池里面
		String str11 = "gaoqi";//常量池里面
		String str12 = new String("gaoqi");//不同于常量池的对象
		
		System.out.println(str10 == str11);
		System.out.println(str12 == str11);//str11 str12不是同一个对象。
		
		//通常比较字符串用equals
		System.out.println(str12.equals(str11));
		
	}

}
