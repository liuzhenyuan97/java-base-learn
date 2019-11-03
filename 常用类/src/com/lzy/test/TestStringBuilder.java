package com.lzy.test;

/**
 * 测试StringBuilder StringBuffer 可变字符序列
 * @author liuzhenyuan
 *
 */
public class TestStringBuilder {
	public static void main(String[] args){
		String str;
		
		//StringBuilder 线程不安全效力高。（一般使用它）
		//StringBuffer 线程安全，效率低。
		StringBuilder sb = new StringBuilder("abcdefg");
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		sb.setCharAt(2, 'M');//第三个字母换成M
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
	}

}
