package com.lzy.test;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

/**
 * �����������ʹ��
 * @author liuzhenyuan
 *
 */

public class TestCanlender {
	public static void main(String[] args){
		
		Calendar calendar = new GregorianCalendar(2999,1,1,1,1,1);
		int year  =  calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);//Ҳ����ʹ��DAY_OF_MONTH
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);//���ڼ�
		System.out.println(year);
		System.out.println(month);
		System.out.println(weekday);
		System.out.println(day);
		
		//�������ڵ���ص�Ԫ�ء�
		Calendar c1 = new GregorianCalendar();
		c1.set(Calendar.YEAR,8012);
		System.out.println(c1);
		
		//���ڵļ���
		Calendar c2 = new GregorianCalendar();
		c2.add(Calendar.YEAR, -100);
		System.out.println(c2);
		
		//���ڶ����ʱ������ת��
		Date d3 = c2.getTime();
		Calendar c3 = new GregorianCalendar();
		c3.setTime(new Date());
		
		printCalendar(c3);
		
	}
	
	public static void printCalendar(Calendar c){
		//��ӡ��1999��11��11�� 11��11:11 ����
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MARCH)+1; //0-11
		int day = c.get(Calendar.DAY_OF_MONTH);
		int dayweek = c.get(Calendar.DAY_OF_WEEK)-1;//1-7 1���գ� 2��һ....
		String dayweek2 = dayweek==0?"��":dayweek+"";
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+"��"+month+"��"+day+"��"+hour+"ʱ"+minute+"��"+second+"��");
		
	}

}
