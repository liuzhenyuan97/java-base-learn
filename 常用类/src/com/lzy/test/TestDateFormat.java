package com.lzy.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ʱ�������ַ���֮��Ļ���ת��
 * DateFormat��SimpleDateFormatʵ�����ʹ��
 * @author liuzhenyuan
 *
 */
public class TestDateFormat {
	public static void main(String[] args) throws ParseException{
		
		//��ʱ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת����Ӧ���ַ���
		DateFormat df = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss");		
		String str = df.format(new Date(400000000));
		System.out.println(str);
		
		//���ַ������ա���ʽ�ַ���ָ���ĸ�ʽ�� ת������Ӧ��ʱ��
		DateFormat df2 = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
		
		Date date = df2.parse("1997��9��21�� 10ʱ10��10��");
		System.out.println(date);
		
		//���������ĸ�ʽ�ַ�
		DateFormat df3 = new SimpleDateFormat("D");
		String str3 = df3.format(new Date());
		System.out.println(str3);
		
	}

}
