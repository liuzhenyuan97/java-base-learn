package com.lzy.test;

import java.util.Date;

/**
 * 测试Date类的常用法
 * @author liuzhenyuan
 *
 */
public class TestDate {
	public static void main(String[] args){
		Date d = new Date();
		System.out.println(d);
		
		System.out.println(d.getTime());
		
		Date d2 = new Date();
		System.out.println(d2.getTime());
		
		System.out.println(d2.after(d));
		
		Date d3 = new Date(2020-1900,3,10);
		System.out.println(d3);
	}
}
