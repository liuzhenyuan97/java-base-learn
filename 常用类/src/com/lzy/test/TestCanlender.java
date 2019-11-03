package com.lzy.test;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

/**
 * 测试日期类的使用
 * @author liuzhenyuan
 *
 */

public class TestCanlender {
	public static void main(String[] args){
		
		Calendar calendar = new GregorianCalendar(2999,1,1,1,1,1);
		int year  =  calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);//也可以使用DAY_OF_MONTH
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);//星期几
		System.out.println(year);
		System.out.println(month);
		System.out.println(weekday);
		System.out.println(day);
		
		//设置日期的相关的元素。
		Calendar c1 = new GregorianCalendar();
		c1.set(Calendar.YEAR,8012);
		System.out.println(c1);
		
		//日期的计算
		Calendar c2 = new GregorianCalendar();
		c2.add(Calendar.YEAR, -100);
		System.out.println(c2);
		
		//日期对象和时间对象的转化
		Date d3 = c2.getTime();
		Calendar c3 = new GregorianCalendar();
		c3.setTime(new Date());
		
		printCalendar(c3);
		
	}
	
	public static void printCalendar(Calendar c){
		//打印：1999年11月11日 11：11:11 周三
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MARCH)+1; //0-11
		int day = c.get(Calendar.DAY_OF_MONTH);
		int dayweek = c.get(Calendar.DAY_OF_WEEK)-1;//1-7 1周日， 2周一....
		String dayweek2 = dayweek==0?"日":dayweek+"";
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒");
		
	}

}
