package com.lzy.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串之间的互相转换
 * DateFormat和SimpleDateFormat实现类的使用
 * @author liuzhenyuan
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException{
		
		//把时间对象按照“格式字符串指定的格式”转成相应的字符串
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");		
		String str = df.format(new Date(400000000));
		System.out.println(str);
		
		//把字符串按照“格式字符串指定的格式” 转换成相应的时间
		DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		
		Date date = df2.parse("1997年9月21日 10时10分10秒");
		System.out.println(date);
		
		//测试其他的格式字符
		DateFormat df3 = new SimpleDateFormat("D");
		String str3 = df3.format(new Date());
		System.out.println(str3);
		
	}

}
